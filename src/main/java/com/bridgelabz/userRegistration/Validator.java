package com.bridgelabz.userRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface UserValidator {
	boolean valid(String name, String pattern);
}

class Validator extends Exception {

	UserValidator validate = (String input, String pattern) -> Pattern.matches(input, pattern);

	public boolean checkPersonMail(String userInput) throws InvalidMailException {
		String Mail_Pattern = "^[a-z][a-z0-9-]+[.]?[a-z0-9-]+@([a-z]+.)+[a-z]{2,4}$";

		Pattern pobjemail = Pattern.compile(Mail_Pattern);
		Matcher matobjemail = pobjemail.matcher(userInput);
		boolean result = validate.valid(userInput, Mail_Pattern);

		if (result == true)

			return result;
		else
			throw new InvalidMailException("Entered Email is not valid");

	}

	public boolean checkFirstName(String userInput) throws InvalidFirstNameException {
		String Name_Pattern = "[A-Z][A-Za-z0-9_]{2,}";
		Pattern pobj = Pattern.compile(Name_Pattern);
		Matcher matobj = pobj.matcher(userInput);

		boolean result = validate.valid(userInput, Name_Pattern);

		if (result == true)

			return result;
		else
			throw new InvalidFirstNameException("First name starts with Cap and has minimum 3 characters");

	}

	public boolean checkLastName(String userInput) throws InvalidLastNameException {
		Pattern pobjLName = Pattern.compile("[A-Z][A-Za-z0-9_]{2,}");
		Matcher matobjlname = pobjLName.matcher(userInput);
		if (matobjlname.matches() == true)

			return matobjlname.matches();
		else
			throw new InvalidLastNameException("Last name should starts with Cap and has mminimum 3 characters");

	}

	public boolean checkMobileNo(String userInput) {
		String Mobile_Pattern = "^[+1-9][0-9]+[ ]?[0-9]{10,12}$";
		Pattern pobjmobile = Pattern.compile(Mobile_Pattern);
		Matcher matobjmobile = pobjmobile.matcher(userInput);
		// return matobjmobile.matches();

		boolean result = validate.valid(userInput, Mobile_Pattern);

		return result;

	}

	public boolean checkPassword(String userInput) {
		String Password_Pattern="^(?=.{8,}$)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*\\W).*$";
		Pattern pobjpass = Pattern.compile(Password_Pattern);
		Matcher matobjpass = pobjpass.matcher(userInput); // (?=.*\\W) - one special character
		//return matobjpass.matches();

		boolean result = validate.valid(userInput, Password_Pattern);

		return result;
	}

}
