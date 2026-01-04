package com.shiva.Library.Operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.shiva.Library.Library;

@Service
public class LibraryBooks
{
	@Autowired
	@Qualifier("Attitude")
	private Library library;


	public void setLibrary(Library library) {
		this.library = library;
	}
	
	public void BookPicker()
	{
		IO.println(library.display());
	}
	
	
	
	
	
}
