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
		String expectOut = "A = 1\n"
				+ "E = 1\n"
				+ "L = 1\n"
				+ "P = 2";
		
		app.testApp("apple");
		
		String actualOut = outputStreamCaptor.toString().trim();
		
		assertEquals(expectOut, actualOut);
	}
	
	@Test
	@DisplayName("Testing the word: abracadabra")
	void anotherWordTest() {
		String expectOut = "A = 5\n"
				+ "B = 2\n"
				+ "C = 1\n"
				+ "D = 1\n"
				+ "R = 2";
		
		app.testApp("abracadabra");
		
		String actualOut = outputStreamCaptor.toString().trim();
		
		assertEquals(expectOut, actualOut);
	}
	
	@Test
	@DisplayName("Testing the word: supercalifragilisticexpialidocious")
	void bigWordTest() {
		String expectOut = "A = 3\n"
				+ "C = 3\n"
				+ "D = 1\n"
				+ "E = 2\n"
				+ "F = 1\n"
				+ "G = 1\n"
				+ "I = 7\n"
				+ "L = 3\n"
				+ "O = 2\n"
				+ "P = 2\n"
				+ "R = 2\n"
				+ "S = 3\n"
				+ "T = 1\n"
				+ "U = 2\n"
				+ "X = 1";
		
		app.testApp("supercalifragilisticexpialidocious");
		
		String actualOut = outputStreamCaptor.toString().trim();
		
		assertEquals(expectOut, actualOut);
	}
	
}
