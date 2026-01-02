package com.example.demo;

import java.time.LocalDate;

public class DiscountCalculator 
{
	LocalDate currentdate;
	double price;
	
	public void setCurrentdate(LocalDate currentdate) {
		this.currentdate = currentdate;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double calculateDiscount()
	{
		String day = currentdate.getDayOfWeek().toString();
		
		if(day.equals("Saturday")||day.equals("Sunday"))
		{
			price = price-((price/100)*20);    
		}
		else
		{
			price=price-((price/100)*10);
		}
	
		return price;
	}
	
	
	
}
