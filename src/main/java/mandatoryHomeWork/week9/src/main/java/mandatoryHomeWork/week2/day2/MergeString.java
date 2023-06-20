package mandatoryHomeWork.week2.day2;

import org.junit.Test;

public class MergeString {
	
	@Test
	public void example1() {
		String word1="abc";
		String word2="pqr";
		mergeStringword(word1, word2);
	}

	private void mergeStringword(String word1, String word2) {
         char[] ch1=word1.toCharArray();
         char[] ch2=word2.toCharArray();
         String word3="";
		 int j=0;
		// int i=Math.max(word1.length(), word2.length());
		 int i=word1.length()+word2.length();
		//System.out.print(i);
		//System.out.print(word2.length());
		 while(j<i){
			  if(j<word1.length()) {
				  word3=word3+ch1[j];
			  } 
			  if(j<word2.length()) {
				  word3=word3+ch2[j];
			  }
			  j++;
			  }
			  System.out.print(word3);
	}
}