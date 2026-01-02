package com.shiva.Beans;

public class Employee
{
	private int empId;
	private String empName;
	private String department;
	
	
	public Employee(int empId, String empName, String department) {
		this.empId = empId;
		this.empName = empName;
		this.department = department;
	}
	

//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}
//
//	public void setEmpName(String empName) {
//		this.empName = empName;
//	}
//	
//	public void setDepartment(String department) {
//		this.department = department;
//	}

	public void introduce()
	{
		IO.println("Employee |-> "+ empId + " : " + empName +" from "+ department);
	}
}
