package com.example.fastwritingserver.auth

import com.fasterxml.jackson.databind.ObjectMapper
import io.jsonwebtoken.Jwts
import io.jsonwebtoken.SignatureAlgorithm
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.Authentication
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter
import java.time.LocalDateTime
import java.time.ZoneId
import java.util.*
import javax.servlet.FilterChain
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class JWTAuthenticationFilter(authenticationManager: AuthenticationManager): UsernamePasswordAuthenticationFilter() {

    private val manager = authenticationManager
    override fun attemptAuthentication(request: HttpServletRequest?, response: HttpServletResponse?): Authentication {
        val user = ObjectMapper().readValue<LoginUser>(request?.inputStream, LoginUser::class.java)
        return manager.authenticate(
                UsernamePasswordAuthenticationToken(
                        user.username,
                        user.password,
                        Arrays.asList()
                )
        )
    }

    override fun successfulAuthentication(request: HttpServletRequest?,
                                          response: HttpServletResponse?,
                                          chain: FilterChain?,
                                          authResult: Authentication?) {
        val expiration = LocalDateTime.now().plusHours(1).atZone(ZoneId.systemDefault())
        val token = Jwts.builder()
                .setSubject((authResult?.principal as UserDetail).username)
                .setExpiration(Date.from(expiration.toInstant()))
                .signWith(SignatureAlgorithm.HS512, SecurityConstants.SECRET)
                .compact()
        response?.addHeader("authorization", "Bearer $token")

        super.successfulAuthentication(request, response, chain, authResult)
    }
}