package Practice;

import java.util.Arrays;

public class sort {

	public static void main(String[] args) {

		String str = "Mayank is Good Boy";

		int letter = 0;
		int digit = 0;
		int whitespace = 0;
		int special = 0;

		char[] a = str.toCharArray();
		for (char b : a) {
			if (Character.isLetter(b)) {
				letter++;
			} else if (Character.isDigit(b)) {
				digit++;
			} else if (Character.isWhitespace(b)) {
				whitespace++;
			} else {
				special++;
			}

		}

		System.out.println(letter);
		System.out.println(digit);
		System.out.println(whitespace);
		System.out.println(special);
	}

}
