package Practice;

public class greaterthenneighbors {

	static void greater(int a[]) {
		for (int i = 1; i < a.length - 1; i++) {
			if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
				System.out.println(a[i]);
			}
		}

	}

	public static void main(String[] args) {

		int a[] = { 45, 32, 45, 65, 78, 33, 44 };
		greater(a);

	}

}
