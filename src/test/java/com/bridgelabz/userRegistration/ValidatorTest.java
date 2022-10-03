package com.bridgelabz.userRegistration;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidatorTest {
	Validator obj = new Validator();
	boolean expectation = true;

	@Test
	public void testCheckMailId() throws InvalidMailException {
		assertEquals(this.expectation, obj.checkPersonMail("ashish07@gmail.com"));

	}

	@Test
	public void testFirstName() throws InvalidFirstNameException {
		assertEquals(this.expectation, obj.checkFirstName("Ashish"));

	}

	@Test
	public void testLastName() {
		assertEquals(this.expectation, obj.checkLastName("Gupta"));

	}

	@Test
	public void testMobileNo() {
		assertEquals(this.expectation, obj.checkMobileNo("91 9044855617"));

	}

	@Test
	public void testPassword() {
		assertEquals(this.expectation, obj.checkPassword("aAshish090@"));

	}
}
