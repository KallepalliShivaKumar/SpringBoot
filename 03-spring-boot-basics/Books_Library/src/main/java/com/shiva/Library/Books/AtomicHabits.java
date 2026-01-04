package com.shiva.Library.Books;

import org.springframework.stereotype.Component;

import com.shiva.Library.Library;
@Component("Atomic")
public class AtomicHabits implements Library
{

	@Override
	public String display() {

		return("Name of the Book : Atomic Habits.\n"
				+ "Name of the Author: James Clear."
				);	}

}
