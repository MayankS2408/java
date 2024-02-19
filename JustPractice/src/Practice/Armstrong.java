package Practice;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int temp = n;
		int res = 0;
		while (temp > 0) {

			int a = temp % 10;
			res = res + a * a * a;
			temp = temp / 10;
		}

		if (res == n) {
			System.out.println("Armstrong");

		} else {
			System.out.println("Not Armstrong");
		}
	}

}
