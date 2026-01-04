package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		TicketPriceCalculator bean =ctx.getBean("age", TicketPriceCalculator.class);
		
		bean.calculatePrice();
		
	}

}
