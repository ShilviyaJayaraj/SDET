package week3Day5;

import org.junit.Test;

public class LetterGreaterThanTarget {
   @Test
   public void example1() {
    	char[] letters= {'c','f','j'};
    	char target='a';
    	System.out.println(greaterThanTarget(letters, target));
    }
   @Test
   public void example2() {
    	char[] letters= {'c','f','j'};
    	char target='c';
    	System.out.println(greaterThanTarget(letters, target));
    }
    @Test
    public void example3() {
     	char[] letters= {'x','x','y','y'};
     	char target='z';
     	System.out.println(greaterThanTarget(letters, target));
     }
	private char greaterThanTarget(char[] letters, char target) {
		char out = 0;
		for(int i=0;i<letters.length; i++) {
	      if(letters[i]>target) {
	    	  out=letters[i];
	    	  //System.out.println(letters[i]);
	    	  break;
	      }
	      else if(i==letters.length-1){
	    	 // System.out.println(letters[0]);
	    	  out=letters[0];
	    	  break;
	      }
		}
		return out;
	}
    
}
