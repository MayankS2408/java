package Practice;

import java.util.Arrays;
import java.util.HashSet;

public class newarray {

	public static void main(String[] args) {

		int[] arr = { 23, 32, 45, 33, 22, 65, 33 };
		HashSet<Integer> set = new HashSet<>();

		for (int a = 0; a < arr.length; a++) {
			set.add(arr[a]);
		}
		System.out.println(set);
	}
}
