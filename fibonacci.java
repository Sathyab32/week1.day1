package WEEK1.DAY1.ASSIGNMENTS;

public class fibonacci {

	public static void main(String[] args) {

		// initialize 3 variables
		int num1=0;
		int num2=1;
		int sum;
		int range = 8;
		
		// print first number
		System.out.println(num1+" " +num2);
		
		// looping till the given range
		for (int i = 1; i<range ; i++) {
		
		// add first and second number assign to sum
		sum = num1 + num2;
		
		// assigning num2 to num1
		num1 = num2;
		
		// Assign sum to the second number
		num2 = sum;
		
		//print sum
		System.out.println(sum);		
			
		}
	}

}
