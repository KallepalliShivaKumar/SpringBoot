package com.shiva.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shiva.Beans.EmployeeController;
import com.shiva.Config.AppConfig;

public class Main {

	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeController ec = context.getBean(EmployeeController.class);
		ec.printInfo();
	}

}
