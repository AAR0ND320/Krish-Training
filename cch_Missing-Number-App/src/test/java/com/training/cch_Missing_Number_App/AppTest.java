package com.training.cch_Missing_Number_App;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Unit tests For the MissingNumber app.
 */
public class AppTest 
{
	MissingNumber missingNumber;
	
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	
	@BeforeEach
	void setUp() {
		missingNumber = new MissingNumber();
		
		System.setOut(new PrintStream(outputStreamCaptor));
	}
	
	@AfterEach
	void tearDown() {
	    System.setOut(standardOut);
	}
	
	@Test
	@DisplayName("Missing value in the middle of the sequence.")
	void testMissingMiddle() {
		String expectOutput = "Missing number is: 20";
		
		missingNumber.testApp("19,22,24,21,23");

		String actualOutput = outputStreamCaptor.toString().trim();
		
		assertEquals(expectOutput, actualOutput, "EXPECTED: <" + expectOutput + ">\n"
				+ "ACTUAL: <" + actualOutput + ">");
	}
	
	@Test
	@DisplayName("Multiple delimiters used.")
	void testMixedDelimiter() {
		String expectOutput = "INVALID INPUT: The sequence should only contain INTEGERS with a COMMA (,) delimiter!";
		
		missingNumber.testApp("19,22, 24,21,23");

		String actualOutput = outputStreamCaptor.toString().trim();
		
		assertEquals(expectOutput, actualOutput, "EXPECTED: <" + expectOutput + ">\n"
				+ "ACTUAL: <" + actualOutput + ">");
	}
	
	@Test
	@DisplayName("More than one number missing.")
	void testMultipleMissing() {
		String expectOutput = "INVALID SEQUENCE: There can only be one number missing.";
		
		missingNumber.testApp("19,22,24,21");

		String actualOutput = outputStreamCaptor.toString().trim();
		
		assertEquals(expectOutput, actualOutput, "EXPECTED: <" + expectOutput + ">\n"
				+ "ACTUAL: <" + actualOutput + ">");
	}
	
	@Test
	@DisplayName("Number missing at the beginning.")
	void testFirstMissing() {
		String expectOutput = "Missing number is: 21";
		
		missingNumber.testApp(",23,22,25,24");

		String actualOutput = outputStreamCaptor.toString().trim();
		
		assertEquals(expectOutput, actualOutput, "EXPECTED: <" + expectOutput + ">\n"
				+ "ACTUAL: <" + actualOutput + ">");
	}
	
	@Test
	@DisplayName("Number missing at the end.")
	void testLastMissing() {
		String expectOutput = "Missing number is: 26";
		
		missingNumber.testApp("23,22,25,24,");

		String actualOutput = outputStreamCaptor.toString().trim();
		
		assertEquals(expectOutput, actualOutput, "EXPECTED: <" + expectOutput + ">\n"
				+ "ACTUAL: <" + actualOutput + ">");
	}
	
	@Test
	@DisplayName("Missing can either be at the beginning or end.")
	void testNoMissing() {
		String expectOutput = "Cannot decide whether the missing number is at the beginning or end of sequence.";
		
		missingNumber.testApp("23,22,25,24");

		String actualOutput = outputStreamCaptor.toString().trim();
		
		assertEquals(expectOutput, actualOutput, "EXPECTED: <" + expectOutput + ">\n"
				+ "ACTUAL: <" + actualOutput + ">");
	}
}
