package com.training.cch_Missing_Number_App;

import java.util.Scanner;

public class MissingNumber {
	private Scanner scanner;

	public MissingNumber() {
		scanner = new Scanner(System.in);
	}
	
	public void startApp() {
		System.out.println( "Enter a sequence with comma (,) delimiter" );
        String inputSequence = scanner.nextLine();
        
        splitSequence(inputSequence);
	}
	
	private void splitSequence(String sequence) {
		String[] sequenceArr = sequence.split(",");
		
		int[] numArr = new int[sequenceArr.length];
		int total = 0; // total of all the given values
		
		try {
			for(int i = 0; i < sequenceArr.length; i++) {
				int num = Integer.parseInt(sequenceArr[i]);
				
				numArr[i] = num;
				
				total += num;
			}
		} catch (Exception e) {
			System.out.println("INVALID INPUT: The sequence should only contain integers with a comma (,) delimiter!");
			return; // Exit from the application here
		}
		
		
	}
	
	/* 
	 * Sum of numbers in a given range is (n/2) * (firstnum + lastnum)
	 * 
	 * Run a recursive on the array of strings converted to int
	 * */
	
}
