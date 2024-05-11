AuthGuardian

Overview:
AuthGuardian is a robust role-based authentication system designed to enhance security and access control in web applications. Built using Java, Spring Boot, Spring Security, and Docker, AuthGuardian provides a flexible and scalable solution for managing user authentication and authorization.

Features:

Role-based access control: Define roles and permissions to restrict access to specific resources based on user roles.
JWT authentication: Secure user authentication using JSON Web Tokens (JWT) for stateless authentication.
User registration and management: Enable users to register, login, and manage their accounts securely.
Token-based authentication: Generate and validate JWT tokens to authenticate users for protected endpoints.
Integration with Spring Security: Utilize Spring Security's powerful features for authentication and authorization.

Database configuration: Configure the database connection properties in application.properties file.
Security configuration: Define security configurations, including roles, permissions, and authentication providers, in SecurityConfig.java.
JWT configuration: Customize JWT token settings, such as token expiration time and secret key, in JwtTokenProvider.java.
