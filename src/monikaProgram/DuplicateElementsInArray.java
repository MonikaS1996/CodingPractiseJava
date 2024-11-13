package monikaProgram;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
	int ar[]= {1,3,6,2,1,5,3,6,1};
	int count = 0;
	for(int i=0; i<=ar.length-1; i++) {
		for(int j=i+1; j<=ar.length-1; j++) {
			if(ar[i]==ar[j]) {
				System.out.print(ar[i]+"  ");
				count++;
			}
		}
		
	}
	System.out.println("\nduplicate element are: "+count);
	}

}
