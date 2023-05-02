package week1Day5;

public class DiamondpatternA2F {
  
	public static void main(String[] args) {
		int letter=65;
		for (int i=0; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				if(k==0||k==i) {
					System.out.print((char)(letter+i)+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
		for (int i=4; i>=0; i--) {
			for(int j=4-i; j>=0; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				if(k==0||k==i) {
					System.out.print((char)(letter+i)+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
}