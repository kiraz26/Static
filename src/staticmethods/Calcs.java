package staticmethods;

public class Calcs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = Calculator.add(10, 20);
		System.out.println(result);
		
		result = Calculator.multiply(10, 20);
		System.out.println(result);
		
		result = Calculator.remainder(20, 3);
		System.out.println(result);
		
		result=Calculator.calculate(234, 98, "-");
		System.out.println(result);
		
		result=Calculator.calculate(234, 98, "*");
		System.out.println(result);
		
		Calculator calc = new Calculator();
		System.out.println(calc.substract(10, 2));
		
	}

}
