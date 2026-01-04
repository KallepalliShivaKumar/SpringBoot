package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        DiscountCalculator dc =
                (DiscountCalculator) context.getBean("discountCalculator");

        double result = dc.calculateDiscount();

        System.out.println("Discounted Price: " + result);
    }
}
