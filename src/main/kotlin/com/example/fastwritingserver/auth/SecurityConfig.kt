package com.example.fastwritingserver.auth

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.CorsConfigurationSource
import org.springframework.web.cors.UrlBasedCorsConfigurationSource
import javax.servlet.http.HttpServletResponse.SC_OK
import javax.servlet.http.HttpServletResponse.SC_UNAUTHORIZED

@Configuration
class SecurityConfig(private val service: AuthenticateService) : WebSecurityConfigurerAdapter() {
    override fun configure(auth: AuthenticationManagerBuilder) {
        auth.userDetailsService(service)
                .passwordEncoder(encoder())
    }

    override fun configure(http: HttpSecurity) {
        http.authorizeRequests()
                .antMatchers("/login").permitAll()
                .antMatchers("/user/register").permitAll()
                .antMatchers("/system/**").permitAll()
                .antMatchers("/lessons/**").permitAll()
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .usernameParameter("username")
                .passwordParameter("password")
                .successHandler { _, res, _ -> res.status = SC_OK }
                .failureHandler { _, res, _ -> res.status = SC_UNAUTHORIZED }
                .and()
            .logout()
                .logoutSuccessHandler {_, res, _ -> res.status = SC_OK }
                .and()
            .csrf()
                .disable()
            .exceptionHandling()
                .authenticationEntryPoint {_, res, _ -> res.status = SC_UNAUTHORIZED }
    }

    fun corsConfigurationSource(): CorsConfigurationSource {
        val corsConfiguration = CorsConfiguration()
        corsConfiguration.addAllowedOrigin("http://localhost:5001")
        corsConfiguration.allowCredentials = true
        corsConfiguration.addAllowedMethod(CorsConfiguration.ALL)
        val corsSource = UrlBasedCorsConfigurationSource()
        corsSource.registerCorsConfiguration("/login", corsConfiguration)
        return corsSource
    }

    @Bean
    fun encoder(): PasswordEncoder {
        return BCryptPasswordEncoder(4)
    }
}