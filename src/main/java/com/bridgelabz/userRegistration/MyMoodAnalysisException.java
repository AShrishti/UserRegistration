package com.bridgelabz.userRegistration;

public class MyMoodAnalysisException extends Exception {

	String message;

	MyMoodAnalysisException(String message) {
		super(message);
		this.message = message;

	}
}

class InvalidFirstNameException extends Exception {

	String message;

	InvalidFirstNameException(String message) {
		super(message);
		this.message = message;

	}
}

class InvalidMailException extends Exception {

	String message;

	InvalidMailException(String message) {
		super(message);
		this.message = message;

	}
}
