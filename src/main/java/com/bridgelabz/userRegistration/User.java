package com.bridgelabz.userRegistration;

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
