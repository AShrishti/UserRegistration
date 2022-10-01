package com.bridgelabz.userRegistration;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {

		User user = new User();
		Validator validate = new Validator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user First Name"); // UC1
		String fname = sc.nextLine();

		boolean result = validate.checkFirstName(fname);
		if (result == true) {
			user.setFirstname(fname);
			System.out.println(user.getFirstname());
		} else {
			System.out.println("First name starts with Cap and has mminimum 3 characters");
		}

		System.out.println("Enter user Last Name"); // UC2
		String sname = sc.nextLine();

		boolean resultLName = validate.checkLastName(sname);

		if (resultLName == true) {
			user.setLastName(sname);
			System.out.println(user.getLastName());
		} else {
			System.out.println("Last name starts with Cap and has mminimum 3 characters");
		}

		System.out.println("Enter user Email"); // UC3
		String email = sc.nextLine();
		boolean resultemail = validate.checkPersonMail(email);
		if (resultemail == true) {
			user.setEmail(email);
			System.out.println(user.getEmail());
		} else {
			System.out.println("Entered Email is not valid");
		}

		System.out.println("Enter user MobileNO"); // UC4
		String mobile = sc.nextLine();

		boolean resultmobile = validate.checkMobileNo(mobile);

		if (resultmobile == true) {
			user.setMobileNo(mobile);
			;
			System.out.println(user.getMobileNo());
		} else {
			System.out.println("Enter Country code follow by space and 10 digit number");
		}

		System.out.println("Enter user Password"); // UC4
		String password = sc.nextLine();

		boolean resultpass = validate.checkPassword(password);

		if (resultpass == true) {
			user.setMobileNo(password);
			;
			System.out.println(user.getMobileNo());
		} else {
			System.out.println(" minimum 8 Characters\r\n" + "Should  have at least 1 Upper Case\r\n"
					+ "Should have at 1least numeric number \r\n" + "Has exactly 1 Special Character\r\n");

		}
		sc.close();
	}
	

}
