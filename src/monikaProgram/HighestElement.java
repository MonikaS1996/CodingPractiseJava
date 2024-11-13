package monikaProgram;

import java.util.Arrays;

public class HighestElement {

	public static void main(String[] args) {
		int a[] = { 11, 3, 22, 40, 7, 43, 45, 22, 48, 93, 53, 22, 34, 4 };
		Arrays.sort(a);

		System.out.println("Highest element: " + a[a.length - 1]);

		System.out.println("Second Highest element: " + a[a.length - 2]);

		System.out.println("Lowest element: " + a[0]);

		System.out.println("Second Lowest element: " + a[1]);

	}

}
