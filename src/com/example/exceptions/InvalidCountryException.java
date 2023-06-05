package com.example.exceptions;

public class InvalidCountryException extends Exception {
	public InvalidCountryException(String countryname) {
		super(countryname);
	}

}
