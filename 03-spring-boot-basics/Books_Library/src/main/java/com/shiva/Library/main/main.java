package com.shiva.Library.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shiva.Library.Library;
import com.shiva.Library.AppConfiguration.AppConfig;
import com.shiva.Library.Operations.LibraryBooks;

public class main {

	public static void main(String[] args)
	{
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		 LibraryBooks bean = ac.getBean(LibraryBooks.class);
		bean.BookPicker();
		
	}

}
