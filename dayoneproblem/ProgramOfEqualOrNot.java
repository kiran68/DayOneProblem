package com.bridgelabz.dayoneproblem;

import java.util.Scanner;

public class ProgramOfEqualOrNot {

	
	public static void main(String[] args) {
	    String s1, s2;
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter First String : ");
		s1 = sc.nextLine();
	    
		System.out.println("Enter Second String : ");
		s2 = sc.nextLine();
		
		if (s1.equals(s2))
			System.out.println("Equal String ");
		else
			System.out.println("Not Equal ");
	    
	    
	   
		}
}
