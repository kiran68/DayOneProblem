package com.bridgelabz.arrayhandlingproblem;

public class ArrayWithDuplicateNumber {
public static void main(String[] args) {
	
	int[] arr = new int[]
			{1, 1, 2, 3, 3, 4, 5, 5};
	System.out.println("Duplicate Number:");
	
	for (int i=0;i<arr.length;i++) {
	for (int k=i+1; k < arr.length;k++) {
	 if (arr[i] == arr[k])
	
	System.out.println("Duplicate Number" + arr[k]);
	}
}
}
}