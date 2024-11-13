package monikaProgram;

public class SeparateCharacteByWhiteSpace {

	public static void main(String[] args) {
		
		String str = "mo n i ka sa n a s teja s";
	
		int count =0 ;
		
		for(int i=0; i<=str.length()-1; i++) {
			
			char temp = str.charAt(i);
			
			if(temp == ' ') {
				count++;
			}
			
		}
		System.out.println("white space count is : "+count);
	}

}
