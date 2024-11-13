package tejasProgram;

import java.util.Scanner;

public class Delimeter {

	public static void main(String[] args) {
		String str = "Hello/Tejas you can do this./keep it up!";

		Scanner sc = new Scanner(str);

		sc.useDelimiter("/");
		while (sc.hasNext()) {
			System.out.println(sc.next());
		}

		System.out.println("Delimeter: " + sc.delimiter());
		sc.close();
	}

}
