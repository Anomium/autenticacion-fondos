# Petición para registrarse

**URL:** `POST: localhost:8080/auth/signup`

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
   "email": "melvin.martinez.97@gmail.com",
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
![Fondos](images/Fondos.png)

```json
{
 "identificadorUnicoTransaccion": "TXN-2024-ABC123",
 "cliente": {
   "id": 2001,
   "nombre": "Juan Pérez",
   "email": "juan.perez@email.com",
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