package WEEK1.day2.ASSIGNMENTS;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator NewObj = new Calculator();
		// sum
		int r1 = NewObj.add(4, 5, 8);
		System.out.println("The sum is : "+r1);
		
		//subtraction
		int r2 = NewObj.sub(81, 37);
		System.out.println("The sub is : "+r2);
		
		//multiplication
		int r3 = NewObj.mul(5, 7);
		System.out.println("the mul is : "+r3);
		
		//division
		float r4 = NewObj.div(100, 3);
		System.out.println("the div is : "+r4);		
		
	}

}
