package WEEK1.day2.ASSIGNMENTS;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// Here is the input
		int[] data = { 3, 2, 11, 4, 6, 7 };

		//sorting the array
		Arrays.sort(data);
		
		// length of an array
		int datalength = data.length;
		
		// second largest number
		System.out.println("the largset number on an given array is : "+data[datalength-2]);
		
	}

}
