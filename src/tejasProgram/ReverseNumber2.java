package tejasProgram;

import java.util.Scanner;

public class ReverseNumber2 {

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		String number = sc.next();
		int reversedNumber = reverse(number);
		System.out.println("Reversed Number: " + reversedNumber);
	}

	private static int reverse(String number) { // 12345

		int length = number.length();
		StringBuilder reversed = new StringBuilder();
		for (int i = length - 1; i >= 0; i--) {
			reversed.append(number.charAt(i));
		}

		return Integer.valueOf(reversed.toString());
	}

}
