package monikaProgram;

public class DuplicateElementInString {

	public static void main(String[] args) {
		String str[] = { "monika", "sanas","java", "monika", "you", "sana","java" };
		int count = 0;
		for (int i = 0; i <= str.length - 1; i++) {
			for (int j = i + 1; j <= str.length - 1; j++) {
				if (str[i].equals(str[j])) {
					System.out.println("  " + str[i]);
					count++;
				}
			}
		}
		System.out.println("Duplicate elements are: "+count);

	}

}
