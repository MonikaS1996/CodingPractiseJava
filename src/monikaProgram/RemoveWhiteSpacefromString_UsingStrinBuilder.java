package monikaProgram;

public class RemoveWhiteSpacefromString_UsingStrinBuilder {

	public static void main(String[] args) {

		String str1 = "mo mi ka s a n a s Teja s";

		StringBuilder str2 = new StringBuilder();

		for (int i = 0; i <= str1.length() - 1; i++) {

			char temp = str1.charAt(i);
			if (temp != ' ') {

				str2.append(temp);
			}
		}

		System.out.println("String with space: " + str1);

		System.out.println("After removing white space string is : " + str2.toString());
	}

}
