package WEEK1.day2.ASSIGNMENTS;

public class Calculator {

	int num1;
	int num2;
	int num3;
	int add_result;
	int sub_result;
	int mul_result;
	float div_result;

	public int add(int a, int b, int c) {
		int add_result = a + b + c;
		return add_result;
	}

	public int sub(int num1, int num2) {
		int sub_result = num1 - num2;
		return sub_result;
	}

	public int mul(int num1, int num2) {
		int mul_result = num1 * num2;
		return mul_result;
	}

	public float div(int num1, int num2) {
		float div_result = num1 / num2;
		return div_result;
	}

	public static void main(String[] args) {
		Calculator Obj1 = new Calculator();

		// add method is accessed through an object
		int result = Obj1.add(1, 2, 4);
		System.out.println("the addition is : " + result);

		// sub method is accessed through an object
		int result1 = Obj1.sub(4, 7);
		System.out.println("The sub result is : " + result1);

		// multiplication method is accessed through an object
		int result3 = Obj1.mul(9, 9);
		System.out.println("The multiplication result is : " + result3);
		
		//division done through an object
		float result4 = Obj1.div(25, 5);
		System.out.println("The division result is : "+result4);

	}

}
