package com.bridgelabz.userRegistration;

public class MyMoodAnalysisException extends Exception {

	String message;

	MyMoodAnalysisException(String message) {
		super(message);
		this.message = message;

	}

}
