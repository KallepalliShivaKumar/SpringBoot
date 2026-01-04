package com.example.demo;

public class Engine {
	
	private String type;
	
	public Engine()
	{
		System.out.println("Engine Object created by the Spring.");
		
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Engine [type=" + type + "]";
	}
	
	

}
