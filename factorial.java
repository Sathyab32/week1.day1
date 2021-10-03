package WEEK1.DAY1.ASSIGNMENTS;

public class factorial {

	public static void main(String[] args) {

		// Declare your input as 5
		int num = 4;

		// Declare an integer variable fact as 1
		int fact = 1;

		// Iterate from 1 to your input (tip: using loop concept)
		for (int i = 1; i <= num; i++) {

			// Within the loop: Multiply fact with the iterator variable (Tip: Assign it to
			// the 'fact' variable)
			
			fact = fact * i;
		}
		// Print factorial (fact)
		System.out.println("Factorial of a given number is " + fact);

	}

}
