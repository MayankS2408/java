package Practice;

public class split {

	public static void main(String[] args) {
//		String s = "Hello World";
//		String[] s1 = s.split(" -");
//		int n = s.length();
//
////		for (int j = 0; j < n; j++) {
////			char ch = s.charAt(j);
////			System.out.print(ch);
////		}
//
//		for (String a : s1) {
//			System.out.println(a);
//		}

		String s = "Mayank";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				count++;

			}
		}
		System.out.println(count);
	}

}
