package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Calculator 
{

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		DiscountCalculator bean = context.getBean("price",DiscountCalculator.class);
		System.out.println(bean.calculateDiscount());
		
		
	}

}
