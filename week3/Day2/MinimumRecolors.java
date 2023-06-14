package week3.Day2;

import org.junit.Test;

/*
 * initialize count as 0
 * in given string take k length and check S.charAt equals W
 * if equals W change W as B then increment the count as 1
 * and store it in new string 
 * check B count equals k
 * if equals, then return the W count
 * else return no consecutive B
 */

public class MinimumRecolors {
      @Test
      public void example1() {                        //BB
    	  String S="WBBWWBBWBW";  //WBBWWBB-BBBBBBB , BBWWBBW-BBBBBBW , BBBBBWB
    	  int k=7;
    	  minRecolor(S, k);
      }

	private void minRecolor(String S, int k) {
		int count=0;
		String sout="";
		//String S1="";
		for(int i=0; i<k;i++) {
			if(S.charAt(i)=='W') {
				//S1+=S.charAt(i);
				sout+="B";
			//	System.out.println("S1"+S1);
				//sout+=S1.replace('W','B');
				count++;
				//sout+=S.charAt(i);
			//	System.out.println(sout);
			}
		 else {
			 sout+=S.charAt(i);
			// System.out.println(sout);
			 }
		//	S1="";
		}
		/*
		 * System.out.println("first loop"+sout); for(int i=1;i<S.length()-k; i++) {
		 * sout+=S.charAt(i+k-1); System.out.println("add+1"+sout); sout=
		 * sout.substring(i); System.out.println("sub-1"+ sout); count++; }
		 */
	     System.out.println(count);
	     }
		
	}