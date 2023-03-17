package com.bridgelabz.whileloopprogram;

public class SumNaturalNumber {

	public static void main(String[] args) {
		
	
	
		int myNum = 231;
		int num = 0;
	    System.out.println("Original Number :" + myNum);
	    
	    while (myNum != 0) {
	    	
	    	int digit = myNum % 10;
	    	num = num * 10 + digit;
	    	
	    	myNum /= 10;
	    }
	    System.out.println("Reversed Number:" + num);
	}

	}

