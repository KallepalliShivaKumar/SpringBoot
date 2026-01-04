package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Beans.ProductDisplay;
import com.config.AppConfig;

public class Main
{

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext sct=new AnnotationConfigApplicationContext(AppConfig.class);
	    ProductDisplay pd = sct.getBean(ProductDisplay.class);
	    pd.show();
	}

}
