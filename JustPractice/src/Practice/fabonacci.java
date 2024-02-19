package Practice;

public class fabonacci {

	public static void main(String[] args) {

		int num = 7;
		fabonacciseries(num);

	}

	static void fabonacciseries(int n) {

		int a = 0, b = 1;
		for (int i = 0; i < n; i++) {

			System.out.print(a + " ");
			int sum = a + b;
			a = b;
			b = sum;
		}

	}

}
