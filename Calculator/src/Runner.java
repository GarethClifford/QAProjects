
public class Runner {

	public static void main(String[] args) {
		System.out.println("Addition " + arithmeticAddition(10, 5));
		System.out.println("Multiplication " + arithmeticMultiplication(10, 5));
		System.out.println("Subtraction " + arithmeticSubtraction(10, 5));
		System.out.println("Division " + arithmeticDivision(10, 5));
	}

	public static double arithmeticAddition(double a, double b) {
		return a + b;

	}

	public static double arithmeticMultiplication(double a, double b) {
		return a * b;
	}

	public static double arithmeticSubtraction(double a, double b) {
		return a - b;
	}

	public static double arithmeticDivision(double a, double b) {
		return a / b;
	}

}
