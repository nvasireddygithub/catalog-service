package com.polarbookshop.catalogservice.domain;

public class BookAlreadyExistsException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7641958711670006922L;
	
	public BookAlreadyExistsException(String isbn) {
        super("A book with ISBN " + isbn + " already exists.");
    }

}
