package Practice;

public class MinMaxarray {

	public static void main(String[] args) {

		int[] arr = { 34, 76, 45, 98 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];

			}

		}
		System.out.println(max);
	}

}
