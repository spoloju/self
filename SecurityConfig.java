package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;

import javax.crypto.spec.SecretKeySpec;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    // Config for PingFederate PS256 JWT on /api/**
    @Configuration
    @Order(1)
    public static class PingFederateSecurityConfig extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http
                .antMatcher("/api/**")
                .authorizeRequests()
                    .antMatchers("/api/public/*").permitAll()
                    .anyRequest().authenticated()
                .and()
                .oauth2ResourceServer()
                    .jwt()
                        .decoder(pingFederateJwtDecoder());
        }

        private JwtDecoder pingFederateJwtDecoder() {
            // Replace with your PingFederate JWK URI or public key
            return NimbusJwtDecoder.withJwkSetUri("your-pingfederate-jwk-uri").build();
        }
    }

    // Config for custom HS256 JWT on /api/public/*
    @Configuration
    @Order(2)
    public static class CustomJwtSecurityConfig extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http
                .antMatcher("/api/public/*")
                .authorizeRequests()
                    .anyRequest().authenticated()
                .and()
                .oauth2ResourceServer()
                    .jwt()
                        .decoder(customJwtDecoder());
        }

        private JwtDecoder customJwtDecoder() {
            // Replace with your HS256 secret key
            String secret = "your-secure-hs256-secret-key-here";
            SecretKeySpec key = new SecretKeySpec(secret.getBytes(), "HmacSHA256");
            return NimbusJwtDecoder.withSecretKey(key).build();
        }
    }
}