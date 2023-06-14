package week2.Day3;

import java.util.Arrays;

import org.junit.Test;

public class DIstring {
	
	/*
	 * I - increment
	 * D - decrement
	 * get string length and start I with 0 and D with length
	 * output length will based on input.length
	 * 
	 */
	
	@Test
	public void example1() {
		String s="III";
		diStringMatch(s);
	}

	private void diStringMatch(String s) {
		int L=s.length(), j=0;
		int[] out=new int[L+1];
		int i=0;
		while(i<s.length()) {
			//System.out.print(s.length());
			if(s.charAt(i)=='I' || i==s.length()) {
				out[i]=j;
				j++;
				i++;
			}
			else if (s.charAt(i)=='D' || i==s.length()){
				out[i]=L;
				L--;
				i++;
			}
			/*
			 * else { out[i]=L; }
			 */
			//System.out.print(i)
		} 
		out[i]=L;
		System.out.println(Arrays.toString(out));
	}

}
