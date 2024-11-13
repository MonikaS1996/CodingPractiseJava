package monikaProgram;

import java.util.Scanner;

public class ReverseNumberUsingString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		
		int num = sc.nextInt();
		
		String numString = Integer.toString(num);
		String ReverseString = "";
		for(int i=0; i<=numString.length()-1; i++) {
			
			ReverseString = numString.charAt(i) +  ReverseString;
			
		}
		
		
		int ReverseNumber = Integer.parseInt(ReverseString);
		
		System.out.println("Reverse number is : "+ReverseNumber);
		System.out.println("monika test");
	}

}
