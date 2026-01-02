package com.shiva.Beans;

public class EmployeeController 
{
	Employee employee;

	public EmployeeController(Employee employee) {
		
		this.employee = employee;
	}
	

	public void printInfo()
	{
		employee.introduce();
		
	}
}
