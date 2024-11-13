package monikaProgram;

import java.util.Scanner;

public class EvenOddNumberSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();

		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.println("Given number is Even number: " + i);
			} else {
				System.out.println("Given number is odd number: " + i);
			}
		}

	}

}
