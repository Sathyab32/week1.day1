package WEEK1.day2.ASSIGNMENTS;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {

		// input
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };

		// array length
		int arrlength = arr.length;

		// sort the array
		Arrays.sort(arr);

		//System.out.println("The sorted array is " + arr);

		// loop through the array (start i from arr[0] till the length of the array)
		for (int i = arr[0]; i < arrlength; i++)
		
		{
		
			if (i != arr[i]) {
				System.out.println(arr[i]);
				

			}
			// else {
			// System.out.println(arr[i]);
			// break;
			// }
		}

	}
}
