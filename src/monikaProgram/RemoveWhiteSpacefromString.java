package monikaProgram;

public class RemoveWhiteSpacefromString {

	public static void main(String[] args) {
		String str = "mo n i ka sa n a s teja s";
		String str2 = "";
		for (int i = 0; i <= str.length() - 1; i++) {
			char temp = str.charAt(i);
			if (temp != ' ') {

				str2 = str2 + temp;
			}
		}

		System.out.println("String after removing white space : " + str2);
	}

}
