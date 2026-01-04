package com.example.demo;

import java.time.LocalDate;

public class Car 
{
	private String name;
	private String number;
	private String DateOfManufacture;
	private LocalDate dateofBuying;
	
	public Car(String name, String number, String dateOfManufacture, LocalDate dateofBuying) {
		super();
		this.name = name;
		this.number = number;
		DateOfManufacture = dateOfManufacture;
		this.dateofBuying = dateofBuying;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setDateOfManufacture(String dateOfManufacture) {
		DateOfManufacture = dateOfManufacture;
	}

	public void setDateofBuying(LocalDate dateofBuying) {
		this.dateofBuying = dateofBuying;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", number=" + number + ", DateOfManufacture=" + DateOfManufacture
				+ ", dateofBuying=" + dateofBuying + "]";
	}
	
	

		
}
