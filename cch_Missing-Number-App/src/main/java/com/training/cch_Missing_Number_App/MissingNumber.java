package com.training.cch_Missing_Number_App;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MissingNumber {
	private Scanner scanner;
	private List<Integer> numList;

	public MissingNumber() {
		scanner = new Scanner(System.in);
	}
	
	public void testApp(String sequence) {
		splitSequence(sequence);
	}
	
	public void startApp() {
		System.out.println( "Enter a sequence with comma (,) delimiter" );
        String inputSequence = scanner.nextLine();
        
        splitSequence(inputSequence);
	}
	
	private void splitSequence(String sequence) {
		String[] sequenceArr = sequence.split(",");
		
//		int[] numArr = new int[sequenceArr.length];
		numList = new ArrayList<>();
		
		int total = 0; // total of all the given values
		
		try {
			for(int i = 0; i < sequenceArr.length; i++) {
				int num = Integer.parseInt(sequenceArr[i]);
				
//				numArr[i] = num;
				numList.add(num);
				
				total += num;
			}
		} catch (Exception e) {
			System.out.println("INVALID INPUT: The sequence should only contain integers with a comma (,) delimiter!");
			return; // Exit from the application here
		}
		
//		int[] minMaxArr = getMinMaxValue(numArr);
		int[] minMaxArr = getMinMaxValue(numList);
		
		int requiredTotal = getRequiredTotal(minMaxArr);
		
		int missingValue = requiredTotal - total;
		
		if(missingValue == 0) {
			
		}
	}

//	private int[] getMinMaxValue(int[] numbers) {
//		int[] minMaxArr = new int[2]; // index 0 will hold minimum value and index 1 will hold maximum
//
//		minMaxArr[0] = numbers[0];
//		minMaxArr[1] = numbers[0];
//
//		for (int i = 1; i < numbers.length; i++) {
//			if (numbers[i] > minMaxArr[0]) {
//				minMaxArr[0] = numbers[i];
//			}
//
//			if (numbers[i] < minMaxArr[1]) {
//				minMaxArr[1] = numbers[i];
//			}
//		}
//		return minMaxArr;
//	}
	
	private int[] getMinMaxValue(List<Integer> numbers) {
		int[] minMaxArr = new int[2]; // index 0 will hold minimum value and index 1 will hold maximum

		minMaxArr[0] = numbers.get(0);
		minMaxArr[1] = numbers.get(0);
		
		for(int number : numbers) {
			if (number > minMaxArr[0]) {
				minMaxArr[0] = number;
			}

			if (number < minMaxArr[1]) {
				minMaxArr[1] = number;
			}
		}
		return minMaxArr;
	}
	
	private int getRequiredTotal(int[] minMaxArr) {
		double n = numList.size() + 1; // double in case n is an odd number
		
		// Calculate required total using (n/2) * (first number + last number).
		return (int) ((n/2) * (minMaxArr[0] + minMaxArr[1]));
	}

	/* 
	 * Sum of numbers in a given range is (n/2) * (firstnum + lastnum)
	 * 
	 * Run a recursive on the array of strings converted to int
	 * */
	
}
