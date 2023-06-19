package mandatoryHomeWork.week3.Day5;

import org.junit.Test;

public class LetterGreaterThanTarget {
   @Test
   public void example1() {
    	char[] letters= {'c','f','j'};
    	char target='a';
    	//System.out.println(greaterThanTarget(letters, target));
    	System.out.println(greaterThanTargettwo(letters, target));
    //	System.out.println(greaterThanTargetusingmid(letters, target));
    }

@Test
   public void example2() {
    	char[] letters= {'c','f','j'};
    	char target='c';
    	//System.out.println(greaterThanTarget(letters, target));
    	System.out.println(greaterThanTargettwo(letters, target));
    }
    @Test
    public void example3() {
     	char[] letters= {'x','x','y','y'};
     	char target='z';
     	//System.out.println(greaterThanTarget(letters, target));
     	System.out.println(greaterThanTargettwo(letters, target));
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
	
	private char greaterThanTargettwo(char[] letters, char target) {
		int left=0,right=letters.length-1;
		char out = 0;
		while(left<=right) {
			if(target<letters[left]) {
				 out=letters[left];
				 break;
			}
			else if(target<=letters[left]) {
				 out=letters[left+1];
			}
			else if(target<letters[right]) {
				out=letters[left];
			}
			else if(left==letters.length-1 ||right==letters.length-1 ) {
				out=letters[0];
			}
			left++;
			right--;
		}
		
		return out;
	
	}

	 private char[] greaterThanTargetusingmid(char[] letters, char target) {
		 int left=0,right=letters.length-1;
			int mid=(left+right)/2;
			while(left<right) {
				if(target<letters[mid]) {
					left=mid-1;
				}
				else {
					left=mid-1;
				}
			}
			return null;
		}
	
}
