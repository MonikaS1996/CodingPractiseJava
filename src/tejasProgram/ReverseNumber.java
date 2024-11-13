package tejasProgram;

import java.util.Scanner;

public class ReverseNumber {

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		int reversedNumber = reverse(number);
		System.out.println("Reversed Number: " + reversedNumber);
	}

	private static int reverse(int number) {
		int temp = number;
		int sum = 0;
		while (temp > 0) {
			int remainder = temp % 10;
			sum = sum * 10 + remainder;
			temp = temp / 10;
		}
		return sum;
	}

}
