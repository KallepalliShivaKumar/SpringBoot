package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		ElectricityBillCalculator bean	=context.getBean("units",ElectricityBillCalculator.class);
		bean.calculateBill();
	}

}
