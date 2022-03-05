package com.training.cch_Number_Of_Occurences;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LetterOccurence {
	
	private Scanner scanner;
	private Map<String, Integer> letterMap = new TreeMap<>();
	
	public LetterOccurence() {
		scanner = new Scanner(System.in);
	}
	
	public void testApp(String word) {
		findOccurences(word);
	}
	
	public void startApp() {
		System.out.println("Enter a word to calculate its letters");
		String inputWord = scanner.nextLine();
		
		findOccurences(inputWord);
	}
	
	private void findOccurences(String word) {
		List<String> letterList = new ArrayList<>();
		
		for(int i=0 ; i < word.length() ; i++) {
			String letter = String.valueOf(word.charAt(i)).toUpperCase();
			
			if(letterMap.containsKey(letter)) {
				letterMap.put(letter, letterMap.get(letter) + 1);
			} else {
				letterMap.put(letter, 1);
				letterList.add(letter);
			}
		}
		
		letterList = bubbleSortStringList((ArrayList<String>)letterList);
		
		for(String index : letterList) {
			System.out.println(index + " = " + letterMap.get(index));
		}
	}
	
	private ArrayList<String> bubbleSortStringList(ArrayList<String> list) {
		int listSize = list.size();
		
		String temp = "";
		
		for (int i = 0; i < listSize; i++) {
			for (int j = 1; j < (listSize - i); j++) {
				if ((list.get(j-1).compareTo(list.get(j)) > 0)) {
					temp = list.get(j-1);
					list.set(j-1, list.get(j));
					list.set(j, temp);
				}
			}
		}
		
		return list;
	}

}
