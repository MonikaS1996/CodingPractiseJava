package monikaProgram;

public class StringReverseUsing_StringBuilder {

	public static void main(String[] args) {
		String str = "monika sanas";

		StringBuilder str2 = new StringBuilder();

		for (int i = str.length() - 1; i >= 0; i--) {
			char temp = str.charAt(i);
			str2 = str2.append(temp);
		}
		System.out.println("Original string is: " + str);
		System.out.println("Reverse String is: " + str2);

		StringBuilder str3 = new StringBuilder(str);
		str3.reverse();
		System.out.println("reverse string using reverse method: " + str3);
	}

}
