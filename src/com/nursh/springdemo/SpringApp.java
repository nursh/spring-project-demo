package com.nursh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car sedan = context.getBean("sedan", Car.class);

        System.out.println(sedan.getDoorStyles());
    }

}
