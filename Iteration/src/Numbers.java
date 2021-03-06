
public class Numbers {

	public static void main(String[] args) {
		System.out.println(words());
	}

	public static int numberTen() {
		int i;
		for (i = 1; i < 10; i++)
			System.out.println(i);
		return i;

	}

	public static int numberThousand() {
		int i;
		for (i = 100; i < 999; i++)
			System.out.println(i);
		return i;
	}

	static String[] WordSingles = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten" };
	static String[] WordTens = { "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety",
			"Hundred" };
	static String[] WordTeens = { "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
			"Eighteen", "Nineteen" };
	static String[] wordtoTeen = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
			"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };

	public static String wordSingles() {
		int i;
		for (i = 1; i < 10; i++) {
			System.out.println(WordSingles[i - 1]);
		}
		return WordSingles[i - 1];
	}

	public static String words() {
		int i;
		int j;
		String solution = "";
		for (i = 0; i < 29; i++) {
			if (i < 19) {
				solution += wordtoTeen[i] + System.lineSeparator();
			} else if ((i + 1) % 10 == 0) {
				solution += WordTens[(i - 1) / 10] + System.lineSeparator();

			}
		}
		return solution;
	}
}
