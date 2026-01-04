package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.Beans.Product;
import com.Beans.ProductDisplay;

public class AppConfig 
{
	@Bean
	public Product get_product()
	{
		return new Product(19,"laptop","apple");
		
	}
	
	@Bean
	public ProductDisplay getProductDisplay()
	{
		return new ProductDisplay(get_product());
		
	}
	
}
