package monikaProgram;

public class StringReverseUsingArray {

	public static void main(String[] args) {

		String str = "monika sanas";
		String strReverse = "";
		char[] a = str.toCharArray();

		for (int i = a.length - 1; i >= 0; i--) {
			char temp = a[i];
			strReverse = strReverse + temp;
		}
		System.out.println("Original string is: " + str);
		System.out.println("Reverse String is: " + strReverse);
	}

}
