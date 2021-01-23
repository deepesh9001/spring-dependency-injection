package com.springframework.springdependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world!!! --- constructor";
    }
}
