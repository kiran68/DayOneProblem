package com.bridgelabz.arrayhandlingproblem;

public class PrintAsendingOrderWithArray {
   public static void main(String[] args) {
	
	   int[] arr = new int [] 
			   {5, 2, 3, 4};
	   int num = 0;
	   
	  System.out.println("Original Array:");
	  
	  for (int i=0;i<arr.length;i++) {
	for(int b =i+1; b< arr.length;b++) {
	if(arr[i]>arr[b]) {
	
	num = arr[i];
	arr[i] = arr[b];
	arr[i]= arr[b];
	arr[b] = num;
	
	
	}
	
}
}
	  
	  System.out.println();
	  
	  
	  for (int i=0;i<arr.length;i++) {
	  System.out.println(arr[i] + "");
}
}
}