package com.bridgelabz.forloopprogram;

public class ReverseIntegerNumber {

	public static void main(String[] args) {
		int mynum = 231, num = 0;
		System.out.println("Original Number is:" + mynum);

		 

		for ( ;mynum != 0; mynum /= 10){
			int digit = mynum % 10;
			num = num * 10 + digit;	
		}
		     System.out.println("Reverse number is :" + num);
		}

		}
	

