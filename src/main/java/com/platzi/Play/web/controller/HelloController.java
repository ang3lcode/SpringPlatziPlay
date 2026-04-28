package com.platzi.Play.web.controller;

import com.platzi.Play.domain.service.PlatingPlayServices;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    private final String plataform;
    private final PlatingPlayServices aiServices;

    public HelloController( @Value("${spring.application.name}") String plataform, PlatingPlayServices aiServices) {
        this.plataform = plataform;
        this.aiServices = aiServices;
    }

    @GetMapping("/hello")
    public String hello() {
        return this.aiServices.generateGreeting(plataform);
    }
}
