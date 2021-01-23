package com.springframework.springdependencyinjection;

import com.springframework.springdependencyinjection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SpringDependencyInjectionApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        String greetings = myController.sayHello();

        System.out.println(greetings);
    }

}
