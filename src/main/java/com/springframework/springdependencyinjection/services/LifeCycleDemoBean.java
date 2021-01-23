package com.springframework.springdependencyinjection.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("## Lifecycle bean constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Bean factory has been set");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("## Bean name has been set = " + s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## Bean has been destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## LifeCycleBean has property set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## Application context has been set");
    }

    @PostConstruct
    public void PostConstruct(){
        System.out.println("## PostConstruct annotated method called");
    }

    @PreDestroy
    public void PreDestroy() {
        System.out.println("## PreDestroy annotated method called");
    }

    public void beforeInit() {
        System.out.println("## Before Init called by bean post processor");
    }

    public void afterInit() {
        System.out.println("## After Init called by bean post processor");
    }
}
