package com.example.demo;

public class ElectricityBillCalculator 
{
	private int Units;

	public ElectricityBillCalculator(int units) {
		super();
		Units = units;
	}
	
	public void calculateBill()
	{
		if(Units<=0)
		{
			System.out.println("Enter a valid value.");
		}
		else if (Units>0 && Units<=100)
		{
			System.out.println(Units*1.5);
		}
		else if (Units>=101 && Units<=300)
		{
			System.out.println(Units*2.5);
		}
		else if (Units>300)
		{
			System.out.println(Units*4);
		}
	}
}
