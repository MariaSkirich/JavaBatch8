package com.syntax.class11;

public class LargestNumber {

	public static void main(String[] args) {

		// I would like to find the largest number in the array

		int[] array = { 10, 0, 20, 8, -1, 77, 56 };

		int largestNum = 0;

		for (int i = 0; i < array.length; i++) {
			if (largestNum < array[i]) {
				largestNum = array[i];
			}
		}
		System.out.println("The largest number from the array is "+largestNum);
		
		System.out.println("-----------ANOTHER WAY--------");
		
		int[] array2 = { 10, 0, 20, 8, -1, 77, 56 };
		
		int max=array[0]; //we assume that the first element is the largest
						  //this way is better, since numbers can be negative
		
		for (int i=0; i<array2.length; i++) {
			if(array[i]>max){
				max=array[i];
			}
		}
		System.out.println("The largest number from the array is "+max);

	}

}
