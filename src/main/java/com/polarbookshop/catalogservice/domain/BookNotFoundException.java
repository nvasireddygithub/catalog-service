package com.polarbookshop.catalogservice.domain;

public class BookNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8347761765024865731L;
	
	public BookNotFoundException(String isbn) {
        super("The book with ISBN " + isbn + " was not found.");
    }

}
