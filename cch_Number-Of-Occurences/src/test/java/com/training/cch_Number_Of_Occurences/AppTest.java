package com.training.cch_Number_Of_Occurences;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
	
	LetterOccurence app;

	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@BeforeEach
	void setUp() {
		app = new LetterOccurence();
		
		System.setOut(new PrintStream(outputStreamCaptor));
	}
	
	@AfterEach
	void tearDown() {
		System.setOut(standardOut);
	}
	
	@Test
	@DisplayName("Testing the word: abracadabra")
	void simpleWordTest() {
		String expectOut = "A = 5\r\n"
				+ "B = 2\r\n"
				+ "C = 1\r\n"
				+ "D = 1\r\n"
				+ "R = 2";
		
		app.testApp("abracadabra");
		
		String actualOut = outputStreamCaptor.toString().trim();
		
		assertEquals(expectOut, actualOut, "EXPECTED: <" + expectOut + ">\n"
				+ "ACTUAL: <" + actualOut + ">");
	}
	
	@Test
	@DisplayName("Testing the input: an apple")
	void whitespaceWordTest() {
		String expectOut = "A = 2\r\n"
				+ "E = 1\r\n"
				+ "L = 1\r\n"
				+ "N = 1\r\n"
				+ "P = 2";
		
		app.testApp("an apple");
		
		String actualOut = outputStreamCaptor.toString().trim();
		
		assertEquals(expectOut, actualOut, "EXPECTED: <" + expectOut + ">\n"
				+ "ACTUAL: <" + actualOut + ">");
	}
	
	@Test
	@DisplayName("Testing the word: apple1")
	void numberWordTest() {
		String expectOut = "INVALID INPUT: The word should only contain alphabetical letters.";
		
		app.testApp("apple1");
		
		String actualOut = outputStreamCaptor.toString().trim();
		
		assertEquals(expectOut, actualOut, "EXPECTED: <" + expectOut + ">\n"
				+ "ACTUAL: <" + actualOut + ">");
	}
	
	@Test
	@DisplayName("Testing the word: @pple")
	void specialCharacterWordTest() {
		String expectOut = "INVALID INPUT: The word should only contain alphabetical letters.";
		
		app.testApp("@pple");
		
		String actualOut = outputStreamCaptor.toString().trim();
		
		assertEquals(expectOut, actualOut, "EXPECTED: <" + expectOut + ">\n"
				+ "ACTUAL: <" + actualOut + ">");
	}
	
}
