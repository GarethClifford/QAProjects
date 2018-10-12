package com.qa.ExamResults;

public class Logic {
	static Subject individualPercentage = a -> (a * 100 / 150);
	static overallSubject overallPercentage = (a, b, c) -> (((a + b + c) * 100 / 450));

	public static double result(double a, Subject subject) {
		return subject.result(a);
	}

	public static double overallResult(double a, double b, double c, overallSubject subject) {
		return subject.overallResult(a, b, c);
	}

	interface Subject {
		double result(double a);

	}

	interface overallSubject {
		double overallResult(double a, double b, double c);
	}

}
