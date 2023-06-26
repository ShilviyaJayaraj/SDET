package mandatoryHomeWork.week1.day5;

import org.junit.Test;

public class Tournament {
	
   @Test
   public void example1() {
	   int n=14;
	   System.out.println(matcheswin(n));
   }
   
   
   @Test
   public void example2() {
	   int n=7;
	   System.out.println(matcheswin(n));
   }


 private static int matcheswin(int n) {
	 int Matches=0;
     int Teamadvance=0;
     int output=0;
	while(n>1) {
		if(n%2==0) {
			Matches=(n)/2;
			Teamadvance=n-Matches;
		}
		else {
			Matches=(n-1)/2;
			Teamadvance=n-Matches;
		}
		n=Teamadvance;
		output+=Matches;
		//System.out.print("n  - "+n);
	}
	
	return output;

}
	
}
