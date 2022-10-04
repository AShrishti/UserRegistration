package com.bridgelabz.userRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Validator extends Exception {

	public boolean checkPersonMail(String userInput) throws InvalidMailException {
		Pattern pobjemail = Pattern.compile("^[a-z][a-z0-9-]+[.]?[a-z0-9-]+@([a-z]+.)+[a-z]{2,4}$");

		Matcher matobjemail = pobjemail.matcher(userInput);
		if (matobjemail.matches() == true)

			return matobjemail.matches();
		else
			throw new InvalidMailException("Entered Email is not valid");

	}

	public boolean checkFirstName(String userInput) throws InvalidFirstNameException {
		Pattern pobj = Pattern.compile("[A-Z][A-Za-z0-9_]{2,}");
		Matcher matobj = pobj.matcher(userInput);

		if (matobj.matches() == true)

			return matobj.matches();
		else
			throw new InvalidFirstNameException("First name starts with Cap and has minimum 3 characters");

	}

	public boolean checkLastName(String userInput)throws  InvalidLastNameException {
		Pattern pobjLName = Pattern.compile("[A-Z][A-Za-z0-9_]{2,}");
		Matcher matobjlname = pobjLName.matcher(userInput);
		if (matobjlname.matches() == true)

			return matobjlname.matches();
		else
			throw new InvalidLastNameException("Last name should starts with Cap and has mminimum 3 characters");

	}

	public boolean checkMobileNo(String userInput) {
		Pattern pobjmobile = Pattern.compile("^[+1-9][0-9]+[ ]?[0-9]{10,12}$");
		Matcher matobjmobile = pobjmobile.matcher(userInput);
		return matobjmobile.matches();

	}

	public boolean checkPassword(String userInput) {
		Pattern pobjpass = Pattern.compile("^(?=.{8,}$)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*\\W).*$");
		Matcher matobjpass = pobjpass.matcher(userInput); // (?=.*\\W) - one special character
		return matobjpass.matches();

	}

}
