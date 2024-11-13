package monikaProgram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();

		if (isPrime(num)) {
			System.out.println(num + " is not prime number");
		} else {
			System.out.println(num + " is prime number");
		}

	}

	public static boolean isPrime(int n) {
		boolean value = false;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				value = true;
				break;
			}
		}

		return value;
	}
}
