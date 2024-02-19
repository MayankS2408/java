package Practice;

public class vowel {

	public static void main(String[] args) {

		String v = "Maynk";
		int count = 0;
		int con = 0;
		char[] c = v.toCharArray();
		for (int i = 0; i < c.length; i++) {

			if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
				count++;
			} else {
				con++;
			}

		}
		System.out.println(count);
		System.out.println(con);

	}

}
