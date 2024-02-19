package Practice;

import java.util.HashMap;

public class duplicatecharacter {

	public static void main(String[] args) {

		String str = "Mayankis";
		char[] a = str.toCharArray();

		HashMap<Character, Integer> map = new HashMap<>();

		for (char b : a) {
			if (map.containsKey(b)) {
				map.put(b, map.get(b) + 1);
			} else {
				map.put(b, 1);
			}
		}
		System.out.println(map);
	}

}
