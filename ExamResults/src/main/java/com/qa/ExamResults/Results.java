package com.qa.ExamResults;

public class Results {
	public static void main(String[] args) {
		Method1(137, 100, 75);
		Method2(137, 100, 175);
	}

	public static void Method1(double a, double b, double c) {
		System.out
				.println("Physics: Mark = " + a + ", Percentage " + Logic.result(a, Logic.individualPercentage) + "%");
		System.out
				.println("Biology: Mark = " + b + ", Percentage " + Logic.result(b, Logic.individualPercentage) + "%");
		System.out
				.println("Chemisty: Mark = " + c + ", Percentage " + Logic.result(c, Logic.individualPercentage) + "%");
	}

	public static void Method2(double a, double b, double c) {
		System.out.println("Total percentage = " + Logic.overallResult(a, b, c, Logic.overallPercentage) + "%");
	}

}
