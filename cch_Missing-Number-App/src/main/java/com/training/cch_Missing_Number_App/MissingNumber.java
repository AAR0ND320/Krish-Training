package com.training.cch_Missing_Number_App;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MissingNumber {
	private Scanner scanner;
	private List<Integer> numList = new ArrayList<>();

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
		
		int total = 0; // total of all the given values
		
		try {
			for(int i = 0; i < sequenceArr.length; i++) {
				if(i == 0 && sequenceArr[i].equals(""))
					continue;
				
				int num = Integer.parseInt(sequenceArr[i]);
				
				numList.add(num);
				
				total += num;
			}
		} catch (Exception e) {
			System.out.println("INVALID INPUT: The sequence should only contain INTEGERS with a COMMA (,) delimiter!");
			return;
		}
		
		int[] minMaxArr = getMinMaxValue(numList);
		
		int min = minMaxArr[0];
		int max = minMaxArr[1];
		
		int requiredTotal = getRequiredTotal(min, max);
		
		int missingValue = requiredTotal - total;
		
		if ((max - min) > numList.size()) { // more than one number is missing
			System.out.println("INVALID SEQUENCE: There can only be one number missing.");
			return;
		}
		
		if(numList.contains(missingValue)) {
			// The value will be either at the beginning or end.
			if(sequence.charAt(0) == ',') {
				missingValue = min - 1;
				System.out.println(missingValue);
			} else if(sequence.charAt(sequence.length() - 1) == ',') {
				missingValue = max + 1;
				System.out.println(missingValue);
			} else {
				System.out.println("Cannot decide whether the missing number is at the beginning or end of sequence.");
			}
		} else {
			System.out.println(missingValue);
		}
	}
	
	private int[] getMinMaxValue(List<Integer> numbers) {
		int[] minMaxArr = new int[2]; // index 0 will hold minimum value and index 1 will hold maximum

		minMaxArr[0] = numbers.get(0);
		minMaxArr[1] = numbers.get(0);
		
		for(int number : numbers) {
			if (number > minMaxArr[1]) {
				minMaxArr[1] = number;
			}

			if (number < minMaxArr[0]) {
				minMaxArr[0] = number;
			}
		}
		return minMaxArr;
	}
	
	private int getRequiredTotal(int min, int max) {
		double n = numList.size() + 1; // double in case n is an odd number
		
		// Calculate required total using (n/2) * (first number + last number).
		return (int) ((n/2) * (max + min));
	}
	
}
