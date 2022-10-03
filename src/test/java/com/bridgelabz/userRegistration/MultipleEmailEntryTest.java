package com.bridgelabz.userRegistration;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MultipleEmailEntryTest {

	String userInput;
	Boolean expectation;
	Validator jobj;

	// Constructor
	public MultipleEmailEntryTest(String userInput, Boolean expectation) {

		this.expectation = expectation;
		this.userInput = userInput;
	}

	@Before
	public void initialize() {
		jobj = new Validator();
	}

	@Parameterized.Parameters
	public static Collection inputs() {
		return Arrays.asList(new Object[][] { { "ashish.gupta07@gmail.com", true }, { "ashu.gupta07@gmail.com", true },
				{ "abc-100@yahoo.com", true }, { "abc-100@abc.net", true }, { "abc111@abc.com", true },
				{ "abc.100@yahoo.com", true }, { " abc.100@abc.com.au", false }, { "abc@1.com", true },
				{ "abc@gmail.com.com", true }, { "abc@gmail.com.com", true } });

	}

	@Test
	public void testCheckMailId() throws InvalidMailException {

		assertEquals(this.expectation, jobj.checkPersonMail(userInput));

	}

}
