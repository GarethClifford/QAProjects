
public class Runner {

	public static void main(String[] args) {
		System.out.println(Reverse("Hello World!"));
	}

	public static String Reverse(String s) {
		String solution = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			solution = solution + String.valueOf(s.charAt(i));

		}
		return solution;

	}
}