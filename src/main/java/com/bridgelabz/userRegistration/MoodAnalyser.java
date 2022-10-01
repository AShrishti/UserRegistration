package com.bridgelabz.userRegistration;

public class MoodAnalyser {

	String message;

	// passing message constructor
	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood(String message) {
		try {
			if (message.contains(("SAD")))
				return "SAD";
			else if (message.equals(null)) {
				throw new MyMoodAnalysisException("Invalid Mood");

			} else
				return "HAPPY";

		} catch (NullPointerException exceptionReference) {
			exceptionReference.printStackTrace();
			return "HAPPY , Please enter Valid Input";
		} catch (MyMoodAnalysisException excepnRef) {
			excepnRef.getMessage();
		}
		return message;
	}
}
