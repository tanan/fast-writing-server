# fast writing server

## register user

```
curl -XPOST -H "Content-Type: application/json" "localhost:8080/user/register" -d '
{
  "username": "foo",
  "password": "bar"
}'
```