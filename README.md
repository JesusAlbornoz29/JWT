# JWT Project

Este proyecto es una aplicación web construida con Java 17 y Spring Boot 3.5.5, utilizando Maven como gestor de dependencias. El objetivo principal de la aplicación es implementar autenticación y autorización mediante JSON Web Tokens (JWT).

## ¿Qué es un JWT?

JSON Web Token (JWT) es un estándar abierto (RFC 7519) que define un formato compacto y autónomo para transmitir información entre partes como un objeto JSON. Esta información puede ser verificada y confiable porque está firmada digitalmente.

### Composición de un JWT

Un JWT se compone de tres partes, separadas por puntos (`.`):

1. **Header (Encabezado)**:
   - Contiene información sobre cómo se firma el token, incluyendo el algoritmo utilizado (por ejemplo, HMAC SHA256 o RSA).

   ```json
   {
     "alg": "HS256",
     "typ": "JWT"
   }


2. **Payload (Cuerpo)**:
   - Contiene las afirmaciones (claims) que se desean transmitir. Estas afirmaciones pueden ser sobre la identidad del usuario y otros datos relevantes.

   ```json
   {
     "sub": "12345678",
     "name": "Alfredo J Albornoz",
     "admin": true
   }


3. **Signature (Firma)**:
   - Se utiliza para verificar que el emisor del JWT es quien dice ser y para asegurar que el mensaje no ha sido alterado. Se crea tomando el encabezado codificado, el cuerpo codificado, una clave secreta y el algoritmo especificado en el encabezado.

   ```json
   {
    HMACSHA256(
    base64UrlEncode(header) + "." +
    base64UrlEncode(payload),
    secret)
   }

  #### ¿Para qué sirve un JWT?
  
  - Autenticación: Una vez que el usuario inicia sesión, se le proporciona un JWT que puede usarse para acceder a rutas protegidas.
  - Autorización: Los JWT pueden contener información sobre permisos y roles del usuario, permitiendo implementar un control de acceso basado en roles.
  - Interoperabilidad: Los JWT son independientes de la plataforma y pueden ser utilizados por diferentes lenguajes de programación.

   ## Diagrama :
   - Spring Security + JWT Utilizado.
   ![Diagrama de Spring Security + JWT](JWT%20Diagrama.png)

  ##### Tecnologías Utilizadas
  Dependencias Principales
  - Spring Web: Proporciona las funcionalidades necesarias para desarrollar aplicaciones web, incluyendo soporte para RESTful APIs.
  
  - PostgreSQL Driver: Permite la conexión y comunicación con bases de datos PostgreSQL, facilitando la persistencia de datos en la aplicación.
  
  - Spring Boot DevTools: Proporciona herramientas para mejorar la experiencia de desarrollo, como reinicio automático de la aplicación y habilitación de cachés de plantillas.
  
  - Lombok: Una biblioteca que ayuda a reducir el código repetitivo en Java, proporcionando anotaciones para generar automáticamente métodos como getters, setters, y constructores.
  
  - Spring Data JPA: Facilita la interacción con bases de datos utilizando la especificación JPA (Java Persistence API), permitiendo la creación de repositorios y simplificando la lógica de acceso a datos.
  
  - Spring Security Starter: Proporciona características de seguridad para la aplicación, como autenticación y autorización, y se integra fácilmente con otras dependencias de Spring.
  
  - JWT (JSON Web Tokens): Utilizado para implementar un mecanismo seguro de autenticación y autorización, permitiendo que los usuarios se autentiquen y accedan a recursos protegidos en la aplicación.
