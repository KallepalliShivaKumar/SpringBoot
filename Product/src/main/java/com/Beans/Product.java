package com.Beans;

public class Product
{
	private int productId;
	private String name;
	private String brand;
	
	public Product(int productId, String name, String brand) {
		super();
		this.productId = productId;
		this.name = name;
		this.brand = brand;
	}
	
	public void displayProduct()
	{
		IO.println("Product Id is : "+ productId);
		IO.println("Product Name is : "+ name);
		IO.println("Product brand is : "+ brand);
	}	
}
