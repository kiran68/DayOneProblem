package com.bridgelabz.dayoneproblem;

public class InvalidInteger {

	
	public static void main(String[] args) {
		int sum = 0, count = 0, number;
		for (int i =0; i<args.length;i++) {
			try {
				number = Integer.parseInt(args[i]);
				sum = sum + number;
			 
		 }
		 catch ( NumberFormatException b) {
			 count++;
		 }
		 }
		System.out.println("Sum of Valid integers:" + sum);
		System.out.println("Count of invalid integers: " + count);
	}
}
