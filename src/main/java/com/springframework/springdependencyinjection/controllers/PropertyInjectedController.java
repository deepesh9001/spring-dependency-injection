package com.springframework.springdependencyinjection.controllers;

import com.springframework.springdependencyinjection.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
