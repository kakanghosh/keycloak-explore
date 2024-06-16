## Generate self signed certs
openssl req -x509 -newkey rsa:2048 -nodes -sha256 -subj "/C=US/ST=YourState/L=YourCity/O=YourOrganization/CN=localhost" -keyout keycloak.key -out keycloak.crt

## Convert certs file to PEM version

```
openssl rsa -in keycloak.key -out keycloak.key.pem -outform PEM
openssl x509 -in keycloak.crt -out keycloak.crt.pem -outform PEM
```