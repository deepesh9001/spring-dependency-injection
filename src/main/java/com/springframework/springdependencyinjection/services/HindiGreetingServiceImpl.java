package com.springframework.springdependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"HI", "default"})
@Service("i18nService")
public class HindiGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Duniya ko Namaskar --- HI";
    }
}
