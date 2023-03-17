package com.bridgelabz.ifelsepractiseproblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgramOfDisplayUnit {

	
	   public static void main(String[] args) throws IOException {
	        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        int four_digit_number, hundreds, ones, tens, thousands;
	        System.out.print("Enter the value of four digit number: ");
	        four_digit_number = Integer.parseInt(in.readLine());
	        ones=four_digit_number%10;
	        tens=four_digit_number%100-ones;
	        hundreds=four_digit_number%1000-tens-ones;
	        thousands=(four_digit_number%10000-hundreds-tens-ones)/1000;
	        hundreds=hundreds/100;
	        tens=tens/10;
	        System.out.println("Value of hundreds: " + hundreds);
	        System.out.println("Value of ones: " + ones);
	        System.out.println("Value of tens: " + tens);
	        System.out.println("Value of thousands: " + thousands);
	        in.close();
	
	
}
}