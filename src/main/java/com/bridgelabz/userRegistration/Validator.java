package com.bridgelabz.userRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Validator {

	public boolean checkPersonMail(String userInput) {
		Pattern pobjemail = Pattern.compile("^[a-z][a-z0-9-]+[.]?[a-z0-9-]+@([a-z]+.)+[a-z]{2,4}$");
		Matcher matobjemail = pobjemail.matcher(userInput);
		return matobjemail.matches();

	}

	public boolean checkFirstName(String userInput) {
		Pattern pobj = Pattern.compile("[A-Z][A-Za-z0-9_]{2,}");
		Matcher matobj = pobj.matcher(userInput);
		return matobj.matches();

	}

	public boolean checkLastName(String userInput) {
		Pattern pobjLName = Pattern.compile("[A-Z][A-Za-z0-9_]{2,}");
		Matcher matobjlname = pobjLName.matcher(userInput);
		return matobjlname.matches();

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
