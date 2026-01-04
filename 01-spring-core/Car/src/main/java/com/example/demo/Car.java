package com.example.demo;

public class Car {
	public Engine engine;
	
	public Car() 
	{
		System.out.println("Car Object is Created by the Spring.");
		
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car has --> " + engine ;
	}

}
