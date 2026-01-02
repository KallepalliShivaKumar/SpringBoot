package com.shiva.Config;

import org.springframework.context.annotation.Bean;

import com.shiva.Beans.Employee;
import com.shiva.Beans.EmployeeController;

public class AppConfig 
{
	@Bean
	private Employee getEmployee()
	{
		return new Employee(101,"Shiva","JAVA");	
	}
	
	@Bean
	private EmployeeController getEmployeeController()
	{
		return new EmployeeController(getEmployee());
		
	}
}
