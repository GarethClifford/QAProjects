package com.qa.UpdatedCalculator;

public class Runner {
	public static void main(String[] args) {
		System.out.println("10 - 5 = " + Logic.operate(10, 5, Logic.subtraction));
		System.out.println("10 + 5 = " + Logic.operate(10, 5, Logic.addition));
		System.out.println("10 * 5 = " + Logic.operate(10, 5, Logic.mulitplication));
		System.out.println("10 / 5 = " + Logic.operate(10, 5, Logic.division));
	}

}
