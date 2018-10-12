
public class Runner {

	public static void main(String[] args) {

		System.out.println(checkstringMatch("Hello World!"));
		System.out.println(checkstringEqual("Hello World!", "Hello World!"));
		System.out.println(checkstringEqual("Hello World!", "Hello"));
	}

	public static boolean checkstringMatch(String a) {
		if (a.equals("Hello World!")) {
			return true;

		} else {

			return false;
		}
	}

	public static boolean checkstringEqual(String a, String b) {
		if (a.equals(b)) {
			return true;
		} else {
			return false;
		}
	}
}
