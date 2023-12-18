package com.example.ecommerce.config;

import io.jsonwebtoken.security.Keys;

public class JwtConstant {
    public static final byte[] SECRET_KEY = Keys.secretKeyFor(io.jsonwebtoken.SignatureAlgorithm.HS256).getEncoded();
    public static final String JWT_HEADER = "Authorization";
}
