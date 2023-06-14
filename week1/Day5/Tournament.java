package week1.Day5;

import org.junit.Test;

public class Tournament {
   @Test
   public static void main(String[] args) {
	   int n=14;
	   matcheswin(n);
   }

private static void matcheswin(int n) {	
	while(n>1) {
		n=n/2;
	}
	System.out.print("Team and matched played are:"+n);
	
}
	
}
