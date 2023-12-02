package com.xolving.tutorics.global.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpMethod
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.web.SecurityFilterChain

@Configuration
@EnableWebSecurity(debug = true)
class SecurityConfig {
    @Bean
    fun filterChain(http: HttpSecurity): SecurityFilterChain{
        http.authorizeHttpRequests { auth ->
            auth.requestMatchers(HttpMethod.GET, "/health").permitAll()
            auth.requestMatchers(HttpMethod.POST, "/auth/**").permitAll()
        }
        return http.build()
    }
}