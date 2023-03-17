package com.bridgelabz.arrayhandlingproblem;

public class ProgramWithLargeNumber {
 
	public static void main(String[] args) {
		int[] arr = new int []{10, 20, 30, 40, 50,};
		
		int sub = arr[0];
		
		for (int i = 0; i<arr.length;i++) {
		
		if(arr[i]> sub) 
		sub = arr[i];
	}
		System.out.println("Print Largest Number:" + sub);
}
}
