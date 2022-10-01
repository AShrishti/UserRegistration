package com.bridgelabz.userRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class User {

	private String Firstname;
	private String LastName;
	private long MobileNo;
	private String Password;
	private String email;

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public long getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(long mobileNo) {
		MobileNo = mobileNo;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "User [Firstname=" + Firstname + ", LastName=" + LastName + ", MobileNo=" + MobileNo + ", Password="
				+ Password + ", email=" + email + "]";
	}

}

public class Registration {

	public static void main(String[] args) {

		User user = new User();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user First Name");
		String fname = sc.nextLine();
		Pattern pobj = Pattern.compile("[A-Z][A-Za-z0-9_]{2,}");
		Matcher matobj = pobj.matcher(fname);
		boolean result = matobj.matches();
		System.out.println(result);
		if (result == true) {
			user.setFirstname(fname);
			System.out.println(user.getFirstname());
		}
		else {
			System.out.println("First name starts with Cap and has mminimum 3 characters");
		}

	}

}
