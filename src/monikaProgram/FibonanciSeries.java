package monikaProgram;

import java.util.Scanner;

public class FibonanciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();

		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();

		System.out.println("enter the number upto which you want series: ");
		int number = sc.nextInt();

		int sum = 0;

		for (int i = 0; i <= number; i++) {

			System.out.print(num1 + " ");
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
	}

}
