package staticmethods;

public class Calculator {

	public static int add(int num1, int num2) {

		return num1 + num2;
	}

	public static int multiply(int num1, int num2) {

		return num1 * num2;
	}

	public static int substract(int num1, int num2) {

		return num1 - num2;
	}

	public static int divide(int num1, int num2) {

		return num1 / num2;
	}

	public static int remainder(int num1, int num2) {

		return num1 % num2;
	}

	public static int calculate(int num1, int num2, String operator) {

		switch (operator) {

		case "+":
			return add(num1, num2);

		case "-":
			return substract(num1, num2);

		case "*":
			return multiply(num1, num2);

		case "/":
			return divide(num1, num2);

		case "%":
			return remainder(num1, num2);

		default:
			System.out.println("Invalid operator: <" + operator + ">");
			return -1;
		}

	}

}
