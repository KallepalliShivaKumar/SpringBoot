package com.example.demo;

public class TicketPriceCalculator 
{
	private int age;

	public TicketPriceCalculator(int age) {
		super();
		this.age = age;
	}
	
	
	public void calculatePrice()
	{
		if(age<=12)
		{
			System.out.println("Ticket Price is : 100 ₹");
		}
		
		else if(age>12 && age<=60)
		{
			System.out.println("Ticket Price is : 200 ₹");
		}
		
		else if(age>60)
		{
			System.out.println("Ticket Price is : 150 ₹");
		}
	}

	
}
