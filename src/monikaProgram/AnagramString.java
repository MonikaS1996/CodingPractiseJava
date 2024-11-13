package monikaProgram;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first string: ");
		String s1 = sc.nextLine();

		System.out.println("enter the second string: ");
		String s2 = sc.nextLine();

		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();

		Arrays.sort(a1);
		Arrays.sort(a2);

		if (Arrays.equals(a1, a2)) {
			System.out.println("Given string is anagram => " + s1 + " and " + s2);
		} else {
			System.out.println("Given string is not anagram => " + s1 + " and " + s2);
		}
	}

}
