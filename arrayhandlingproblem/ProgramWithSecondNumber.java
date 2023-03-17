package com.bridgelabz.arrayhandlingproblem;

public class ProgramWithSecondNumber {
public static int secondLarge(int[] arr) {
	

	int temp;
	for (int i=0;i < arr.length;i++) {
		for(int z = i+1;z < arr.length;z++) {
			if (arr[i] > arr[z]) {
			temp = arr[i];
			arr[i]=arr[z];
			arr[z] = temp;
			
				
			}
		}
	}
	return arr[-2];	
}
public static void main(String[] args) {
	int arr[]= {14, 18, 24, 30, 45};
	System.out.println("Second Largest" +secondLarge(arr[5]));
	
	}
}
