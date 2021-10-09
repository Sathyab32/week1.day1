package WEEK1.day2.ASSIGNMENTS;

import java.util.Arrays;

public class missing {

			public static void main(String[] args) {

			int[] arr = {1,2,3,4,7,6,8};
			
			int arrlength = arr.length;
			
			// Sort the array
			Arrays.sort(arr);
			
			// loop through the array (start i from arr[0] till the length of the array)
			for (int i = arr[0]; i < arrlength; i++) {
				
				// check if the iterator variable is not equal to the array values respectively
				if(i!=arr[i])
				{
					// print the number
					System.out.println(arr[i]);
					
					// once printed break the iteration
					
				}
				else 
				{
					System.out.println(arr[i]);
					break;
				}
			}
			
		}

	}