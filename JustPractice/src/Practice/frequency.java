package Practice;

import java.util.HashMap;

public class frequency {

	@SuppressWarnings("removal")
	public static void main(String[] args) {

		String str = "dfjssjgffh";
		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
//			System.out.println(ch);

			Integer c = map.get(ch);

			if (c != null) {
				map.put(ch, new Integer(c + 1));
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}

}
