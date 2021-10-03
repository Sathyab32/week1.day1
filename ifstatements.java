package testleaf;

public class ifstatements {

	public static void main(String[] args) {

		// string status = "completed"
		// boolean status = true;
		int num = 34;
		/*
		 * if (status == true) { System.out.println("you get a break");
		 * 
		 * } else { System.out.println("no break"); }
		 */

		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("TRIZZ FIIZZ");
		}
		
		 else if (num % 3 == 0) {
				System.out.println("TRIZZ");

			} 

		else if (num % 5 == 0) {
			System.out.println("FIZZ");

		}

		else {
			System.out.println("the number is neither TRIZZ NOR FIZZ");
		}
	}

}
