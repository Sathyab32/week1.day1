package WEEK1.day2.ASSIGNMENTS;

public class DuplicateInArray {

	public static void main(String[] args) {

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

		int arrlength = arr.length;

		int count = 0;

		System.out.println("Duplicate Values are :");

		for (int i = 0; i < arrlength - 1; i++) {

			for (int j = i + 1; j < arrlength; j++) {

				if (arr[i] == arr[j]) {
					count++;

					System.out.println(arr[i]);
					
					break;

				}

			}

		}
	}

}
