package com.bridgelabz.switchstatment;

import java.util.Scanner;

public class ProgramWithVowelOrConsonant {

	public static void main(String[] args) {
		int alpha = 0;
		System.out.println("Enter Any Character");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		switch (ch) {
		
		case 'a' :
	    case 'e' :
	    case 'i' :
	    case 'o' :
	    case 'u' :
	    case 'A' :
	    case 'E' :
	    case 'I' :
	    case 'O' :
	    case 'U' : alpha++;
	 }
	if (alpha == 1)
		System.out.println("Entered Character"+ch+" is Vowel ");
	else
	 if ((ch>='a'&& ch<='z') || (ch>='A'&& ch<='Z'))
	System.out.println("Entered Character"+ch+" is Consonant");
	 else
	System.out.println("Your entered worng number");
	}


	}

	
	

