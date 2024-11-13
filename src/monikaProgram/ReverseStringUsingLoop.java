package monikaProgram;

public class ReverseStringUsingLoop {

	public static void main(String[] args) {

		String str = "monika sanas";
		String strReverse = "";
		for (int i = 0; i <= str.length() - 1; i++) {
			char temp = str.charAt(i);
			strReverse = temp + strReverse;

		}
		System.out.println("Original string is: " + str);
		System.out.println("Reverse String is: " + strReverse);
	}

}
