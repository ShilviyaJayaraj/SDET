package mandatoryHomeWork.week2.day5;

import org.junit.Test;

public class Reversestring {
      @Test
      public void example1() {
    	  String s="Let's take LeetCode contest";
    	  reverseword(s);
      }

	private void reverseword(String s) {
		String[] sp=s.split(" ");
		String rev=" ";
		  for(String word:sp) {
			  String assign=word;
			   for(int j=word.length()-1; j>=0; j--) {
		          rev=rev+assign.charAt(j);
		       } 
			   rev=rev+" ";
			 }
	System.out.print(rev);
		}
	}