# Documentación para ejecutar la API SpringSecurityRestAPIJWTDemo

# Configuración de Base de Datos MySQL

## Configuración en `application.properties`

```properties
spring.datasource.url = jdbc:mysql://localhost:3306/springbootRestApiJWT?useSSL=false&serverTimezone=UTC
spring.datasource.username = root
spring.datasource.password = root
```
## Configuración en `MySQL`
```properties
CREATE DATABASE springbootRestApiJWT;
```
## Configuración en la variable de entorno
- La variable `SECRET_KEY` debe de tener una longitud minima de 256 bits
```properties
jwt.token.secret=${SECRET_KEY}
```
# Documentación para ejecutar la API Fondos
## Configuración de MongoDB

## Configuración en `application.yml`

```yml
spring:
  data:
    mongodb:
      host: localhost
      port: 27017
      database: spring_boot_test
```
# Petición para registrarse

**URL:** `POST: localhost:9090/auth/signup`

## Body
```json
{
    "name": "Anonimo Nombre",
    "email": "Anonimo.Nombre.97@gmail.com",
    "password": "123456789"
}
```
# Petición para logearse

**URL:** `POST: localhost:9090/auth/signin`

## Body
```json
{
   "email": "anonimo.apellido.97@gmail.com",
   "password": "123456789"
}
```

# Petición para deslogearse

**URL:** `POST: localhost:9090/auth/signout`

# Petición para crear

**URL:** `localhost:9090/secret_resource/crear`

## Body
### El monto del Fondo hace referencia a la cantidad que se desea invertir en cada fondo
### El id del  es el que aparece en la informacion de los fondos
![Fondos](https://github.com/Anomium/autenticacion-fondos/blob/main/src/main/resources/static/images/Fondos.png)
```json
{
 "identificadorUnicoTransaccion": "TXN-2024-ABC123",
 "cliente": {
   "id": 2001,
   "nombre": "anonimo apellido",
   "email": "anonimo.apellido@email.com",
   "saldo": 150000.50,
   "preferenciaNotificacion": "EMAIL"
 },
 "fondo": [
   {
     "id": 1,
     "monto": 15000
   },
   {
     "id": 2,
     "monto": 15000
   },
   {
     "id": 3,
     "monto": 15000
   }
 ]
}
```

# Petición para cancelar suscripción

**URL:** `localhost:9090/secret_resource/cancelar/suscripcion`

## Body
```json
{
   "id": "32445b6d-43f5-4436-8268-e62e284908e9",
   "idFondo": "3"
}
```

# Petición para listar transacciones

**URL:** `localhost:9090/secret_resource/listar`

# cURL Commands - API Documentation

## 1. Registrarse (Signup)

```bash
curl --location 'localhost:9090/auth/signup' \
--header 'Content-Type: application/json' \
--data-raw '{
   "name": "anonimo apellido",
   "email": "anonimo.apellido.97@gmail.com",
   "password": "123456789"
}'
```

## 2. Iniciar Sesión (Signin)

```bash
curl --location 'localhost:9090/auth/signin' \
--header 'Content-Type: application/json' \
--data-raw '{
   "email": "anonimo.apellido.97@gmail.com",
   "password": "123456789"
}'
```

## 3. Cerrar Sesión (Signout)

```bash
curl --location 'localhost:9090/auth/signout' \
--header 'Content-Type: application/json' \
--data-raw '{}'
```

## 4. Crear Transacción

```bash
curl --location 'localhost:9090/secret_resource/crear' \
--header 'Content-Type: application/json' \
--data-raw '{
 "identificadorUnicoTransaccion": "TXN-2024-ABC123",
 "cliente": {
   "id": 2001,
   "nombre": "anonimo apellido",
   "email": "anonimo.apellido@email.com",
   "saldo": 150000.50,
   "preferenciaNotificacion": "EMAIL"
 },
 "fondo": [
   {
     "id": 1,
     "monto": 15000
   },
   {
     "id": 2,
     "monto": 15000
   },
   {
     "id": 3,
     "monto": 15000
   }
 ]
}'
```

## 5. Cancelar Suscripción

```bash
curl --location 'localhost:9090/secret_resource/cancelar/suscripcion' \
--header 'Content-Type: application/json' \
--data-raw '{
   "id": "32445b6d-43f5-4436-8268-e62e284908e9",
   "idFondo": "3"
}'
```

## 6. Listar Transacciones

```bash
curl --location 'localhost:9090/secret_resource/listar' \
--header 'Content-Type: application/json'
```

---

### Notas
- Asegúrate de que el servidor esté corriendo en los puertos indicados
- Los endpoints bajo `/secret_resource/` requieren autenticación JWT
- Los endpoints bajo `/auth/` son públicos