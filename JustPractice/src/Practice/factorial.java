package Practice;

public class factorial {

	public static void main(String[] args) {

		int n = 7;
		System.out.println(facto(n));

	}

	static int facto(int num) {
		if (num == 1) {
			return 1;
		}

		else {
			return num * facto(num - 1);

		}

	}
}
