package com.shiva.Library.Books;

import org.springframework.stereotype.Component;

import com.shiva.Library.Library;
@Component("money")
public class PsychologyOfMoney implements Library
{

	@Override
	public String display()
	{
		
		return("Name of the Book : Psychology Of Money.\n"
				+ "Name of the Author: Morgan Housel."
				);
	}

}
