package com.bridgelabz.ifelsepractiseproblem;

import java.util.Scanner;

public class SingleDigitNumber {

	
	public static void main(String[] args) {
		int a;
		System.out.println(" Enter the Number :");
		Scanner sc = new Scanner(System.in);
		  a = sc.nextInt();
		  if (a == 0) {
			  System.out.println("You are enter Single Digit Number");
		  }
		  else if(a < 2) {
			  System.out.println("Your Enter : ONE ");
		  }
		  else if (a <3 ) {
			  System.out.println("Your Enter : TWO");
		  }
		  else if (a < 4) {
			  System.out.println("Your Enter : THREE");
		  }
		  else if (a < 5) {
			  System.out.println("Your Enter : FOUR");
			 }
		  else if (a < 6) {
			  System.out.println("Your Enter : FIVE");
		  }
		  else if (a < 7 ) {
			  System.out.println("Your Enter : SIX");
		  }
		  else if (a < 8) {
			  System.out.println("You Enter : SEVEN");
		  }
		  else if (a < 9) {
			  System.out.println("Your Enter :EIGHT");
		  }
		  else if (a < 10) {
			  System.out.println("You Enter : NINE");
		  }
		 else {
			  System.out.println("You have to enter correct number");
	}  
	}
	}


