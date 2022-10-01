package com.bridgelabz.userRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class User {

	private String Firstname;
	private String LastName;
	private String MobileNo;
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

	public String getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(String mobileNo) {
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
class Validator{
	
	public boolean checkPersonMail(String userInput) {
		Pattern pobjemail = Pattern.compile("^[a-z][a-z0-9-]+[.]?[a-z0-9-]+@([a-z]+.)+[a-z]{2,4}$");
		Matcher matobjemail = pobjemail.matcher(userInput);
		return matobjemail.matches();

	}
	
	
}

public class Registration {

	public static void main(String[] args) {

		User user = new User();
		Validator validate= new Validator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user First Name"); // UC1
		String fname = sc.nextLine();
		Pattern pobj = Pattern.compile("[A-Z][A-Za-z0-9_]{2,}");
		Matcher matobj = pobj.matcher(fname);
		boolean result = matobj.matches();

		if (result == true) {
			user.setFirstname(fname);
			System.out.println(user.getFirstname());
		} else {
			System.out.println("First name starts with Cap and has mminimum 3 characters");
		}

		System.out.println("Enter user Last Name"); // UC2
		String sname = sc.nextLine();
		Pattern pobjLName = Pattern.compile("[A-Z][A-Za-z0-9_]{2,}");
		Matcher matobjlname = pobjLName.matcher(sname);
		boolean resultLName = matobjlname.matches();

		if (resultLName == true) {
			user.setLastName(sname);
			System.out.println(user.getLastName());
		} else {
			System.out.println("Last name starts with Cap and has mminimum 3 characters");
		}

		System.out.println("Enter user Email"); // UC3
		String email = sc.nextLine();
		boolean resultemail=validate.checkPersonMail(email);
		if (resultemail == true) {
			user.setEmail(email);
			System.out.println(user.getEmail());
		} else {
			System.out.println("Entered Email is not valid");
		}

		System.out.println("Enter user MobileNO"); // UC4
		String mobile = sc.nextLine();
		Pattern pobjmobile = Pattern.compile("^[+1-9][0-9]+[ ]?[0-9]{10,12}$");
		Matcher matobjmobile = pobjmobile.matcher(mobile);
		boolean resultmobile = matobjmobile.matches();

		if (resultmobile == true) {
			user.setMobileNo(mobile);
			;
			System.out.println(user.getMobileNo());
		} else {
			System.out.println("Enter Country code follow by space and 10 digit number");
		}

		System.out.println("Enter user Password"); // UC4
		String password = sc.nextLine();
		Pattern pobjpass = Pattern.compile("^(?=.{8,}$)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*\\W).*$");
		Matcher matobjpass = pobjpass.matcher(password); // (?=.*\\W) - one special character
		boolean resultpass = matobjpass.matches();

		if (resultpass == true) {
			user.setMobileNo(password);
			;
			System.out.println(user.getMobileNo());
		} else {
			System.out.println(" minimum 8 Characters\r\n" + "Should  have at least 1 Upper Case\r\n"
					+ "Should have at 1least numeric number \r\n" + "Has exactly 1 Special Character\r\n");

		}
	}

}
