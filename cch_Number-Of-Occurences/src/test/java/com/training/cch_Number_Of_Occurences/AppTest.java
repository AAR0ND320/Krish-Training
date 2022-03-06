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
	@DisplayName("Testing the word: apple")
	void simpleWordTest() {
		String expectOut = "A = 1\r\n"
				+ "E = 1\r\n"
				+ "L = 1\r\n"
				+ "P = 2";
		
		app.testApp("apple");
		
		String actualOut = outputStreamCaptor.toString().trim();
		
		assertEquals(expectOut, actualOut);
	}
	
	@Test
	@DisplayName("Testing the word: abracadabra")
	void anotherWordTest() {
		String expectOut = "A = 5\r\n"
				+ "B = 2\r\n"
				+ "C = 1\r\n"
				+ "D = 1\r\n"
				+ "R = 2";
		
		app.testApp("abracadabra");
		
		String actualOut = outputStreamCaptor.toString().trim();
		
		assertEquals(expectOut, actualOut);
	}
	
	@Test
	@DisplayName("Testing the word: supercalifragilisticexpialidocious")
	void bigWordTest() {
		String expectOut = "A = 3\r\n"
				+ "C = 3\r\n"
				+ "D = 1\r\n"
				+ "E = 2\r\n"
				+ "F = 1\r\n"
				+ "G = 1\r\n"
				+ "I = 7\r\n"
				+ "L = 3\r\n"
				+ "O = 2\r\n"
				+ "P = 2\r\n"
				+ "R = 2\r\n"
				+ "S = 3\r\n"
				+ "T = 1\r\n"
				+ "U = 2\r\n"
				+ "X = 1";
		
		app.testApp("supercalifragilisticexpialidocious");
		
		String actualOut = outputStreamCaptor.toString().trim();
		
		assertEquals(expectOut, actualOut);
	}
	
}
