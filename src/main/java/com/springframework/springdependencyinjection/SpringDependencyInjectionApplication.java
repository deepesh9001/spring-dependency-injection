package com.springframework.springdependencyinjection;

import com.springframework.springdependencyinjection.controllers.ConstructorInjectedController;
import com.springframework.springdependencyinjection.controllers.MyController;
import com.springframework.springdependencyinjection.controllers.PropertyInjectedController;
import com.springframework.springdependencyinjection.controllers.SetterInjectedController;
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

        System.out.println("----- Property injected -----");

        PropertyInjectedController propertyInjectedController =
                (PropertyInjectedController) ctx.getBean("propertyInjectedController");

        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("----- Setter injected -----");

        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

        System.out.println(setterInjectedController.getGreeting());

        System.out.println("----- Constructor injected -----");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.getGreeting());

    }

}
