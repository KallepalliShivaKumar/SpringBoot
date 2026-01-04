package com.shiva.Library.Books;

import org.springframework.stereotype.Component;
import com.shiva.Library.Library;

@Component("Attitude")
public class AttitudeIsEverything implements Library
{
	@Override
	public String display() {
		
		return( "Name of the Book  : Attitude is Everything.\n"
						+ "Name of the Author: Jeff Keller.");
			
	}
}
