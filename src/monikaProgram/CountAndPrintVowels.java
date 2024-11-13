package monikaProgram;

import java.util.Scanner;

public class CountAndPrintVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		int count = 0;

		for (int i = 0; i <= str.length() - 1; i++) {
			char t = str.charAt(i);
			if (t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u') {

				count++;
				System.out.println(t);
			}
		}

	}

}
