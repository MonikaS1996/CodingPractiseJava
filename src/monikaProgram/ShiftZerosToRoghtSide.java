package monikaProgram;

public class ShiftZerosToRoghtSide {

	public static void main(String[] args) {
		int a1[] = { 1, 5, 0, 6, 0, 3, 1, 7, 50, 4, 0, 3, 0 };
		int a2[] = new int[a1.length];
		int index = 0;
		for (int i = 0; i <= a1.length - 1; i++) {

			if (a1[i] != 0) {
				a2[index] = a1[i];
				index++;
			}

		}

		for (int i = 0; i <= a2.length - 1; i++) {
			System.out.print(a2[i] + "  ");
		}
	}

}