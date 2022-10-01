package com.bridgelabz.userRegistration;

public class MoodAnalyser {

	String message;

	// constructor
	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() {
		try {
			if (message.contains(("SAD")))
				return "SAD";

			else

				return "HAPPY";
		} catch (NullPointerException exceptionReference) {
			exceptionReference.printStackTrace();
			System.out.println("catch block");
			return "HAPPY , Please enter Valid Input";
		}
	}
}
