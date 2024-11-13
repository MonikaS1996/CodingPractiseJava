package monikaProgram;

import java.util.Scanner;

public class ScannerDelimeter {

	public static void main(String[] args) {
		
		String str = "monika/sanas/from/bengalur aradhya devait";
		Scanner sc = new Scanner(str);
		
		sc.useDelimiter(" ");
		
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}

		System.out.println("using scanner : "+sc.delimiter());
	}

}
