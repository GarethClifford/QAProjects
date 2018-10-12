
public class UpdatedRunner {

	public static void main(String[] args) {
		System.out.println("10 + 5 = " + basicMath(10, 5, "Add"));
		System.out.println("10 - 5 = " + basicMath(10, 5, "Subtract"));
		System.out.println("10 x 5 = " + basicMath(10, 5, "Multiply"));
		System.out.println("10 / 5 = " + basicMath(10, 5, "Divide"));
	}

	public static double basicMath(double a, double b, String c) {

		double d = 0;
		if (c.equals("Add")) {
			d = a + b;
		} else if (c.equals("Subtract")) {
			d = a - b;
		} else if (c.equals("Multiply")) {
			d = a * b;
		} else if (c.equals("Divide")) {
			d = a / b;
		}
		return d;

	}
}