package com.qa.UpdatedCalculator;

public class Logic {
	static MathOperation subtraction = (a, b) -> a - b;
	static MathOperation addition = (a, b) -> a + b;
	static MathOperation mulitplication = (a, b) -> a * b;
	static MathOperation division = (a, b) -> a / b;

	public static double operate(double a, double b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}

	interface MathOperation {
		double operation(double a, double b);
	}

}
