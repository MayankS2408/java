package Practice;

import java.util.Arrays;

public class reversestring {

	public static void main(String[] args) {

		String s = "bca";
		char[] c = s.toCharArray();
		Arrays.sort(c);
		System.out.println(c);
		
		int n = s.length();

		for (int i = n - 1; i < 0; i--) {
//			System.out.print(s.charAt(i));
		}
		System.out.println(s);
	}
	
}
