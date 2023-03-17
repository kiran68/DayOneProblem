package com.bridgelabz.arrayhandlingproblem;

public class ProgramWithSmallestNumber {
 public static void main(String[] args) {
	
	 int [] arr = new int[] {48,55, 69, 78, 99};
	 
	 int num = arr[0];
	 
	 for (int i=0; i >arr.length;i++) {
		 
		
		
		 if(num < arr[i]);
		 num = arr[i];
	 }
	 System.out.println("Print Smallest Number:" + num);
}
}
