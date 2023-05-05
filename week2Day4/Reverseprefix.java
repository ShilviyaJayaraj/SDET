package week2Day4;

import org.junit.Test;

/*
 * loop and find index of given character
 * create temp variable and add last index to first using 2 pointer
 * then print it
 */

public class Reverseprefix {
	 @Test
	 public void example1() {
		 String word="abcdefd";
		 char ch='d';
		 reversePrefixOfWord(word, ch);
	 }

	private void reversePrefixOfWord(String word, char ch) {
		//System.out.print(word.length());
		int count =0, index=0;
		String out=new String();
		for(int i=0; i<word.length();i++) {
			if(count == 0 && ch==word.charAt(i)) {
				count=count+1;
			    index=i;
				System.out.println(index);
			}
		}
		
		StringBuilder sb=new StringBuilder(word.substring(0, index+1));
        sb.reverse();
        if(index+1<word.length()) {
        	sb.append(word.substring(index+1));
        	
        }
        System.out.print(sb);
	}

}



// count=0; 
/*
 * while(count<index+1) { // int left=0; int right=index; if(index>0) { String
 * temp=""; temp=temp+word.charAt(right); right--; // System.out.print(right);
 * System.out.print(temp); } count++; }
 */
