package monikaProgram;

import java.util.Scanner;

public class FactorialProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int fact = 1;
		if (num == 0 || num == 1) {
			System.out.println("Factorial of given number " + num + "is 1.");
		}

		for (int i = 1; i <= num; i++) {
			fact = fact * i;

		}
		System.out.println("Factorial of given number " + num + " is " + fact);
	}

}
