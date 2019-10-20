# fast writing server

## register user

```
curl -XPOST -H "Content-Type: application/json" "localhost:8080/user/register" -d '
{
  "username": "foo",
  "password": "bar"
}'
```

```
curl -XPOST -H "Content-Type: application/json" "fast-writing.weeekend.work/api/v1/user/register" -d '
{
  "username": "foo",
  "password": "bar"
}'
```

- login
```
curl -v -XPOST -H"Content-Type: application/json" localhost:8080/login -d '
{
    "username": "foo",
    "password": "bar"
}'
```