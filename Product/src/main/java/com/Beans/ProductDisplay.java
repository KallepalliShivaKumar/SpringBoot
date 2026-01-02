package com.Beans;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductDisplay
{
	@Autowired
	Product product;
	public ProductDisplay(Product product) {
	this.product = product;
	}
	public void show()
	{
		product.displayProduct();
	}
	
	
}
