
public class Factorial {

	public static void unFactorial(int N) {
		int i = 2;
		int k = N;
		while (k != 1) {
			if (k % i == 0) {
				k = k / i;
				i += 1;
			} else {
				System.out.println(N + " NONE");
				break;
			}

		}
		if (k == 1) {
			System.out.println(N + " = " + i + "!");

		}
	}
}
