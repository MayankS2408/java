package Practice;

import java.util.Scanner;

public class PrimeNumberCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Read an integer from the user
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		// Check if the number is prime and print the result
		if (isPrime(number)) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}

		scanner.close();
	}

	private static boolean isPrime(int n) {
		if (n <= 1) {
			return false; // Numbers less than or equal to 1 are not prime
		}

		// Check for divisibility from 2 to half of the number
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false; // The number is divisible, not prime
			}
		}

		return true; // If no divisor is found, the number is prime
	}
}
