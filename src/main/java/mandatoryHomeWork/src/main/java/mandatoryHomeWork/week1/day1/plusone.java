package mandatoryHomeWork.week1.day1;

import java.util.Arrays;

import org.junit.Test;

public class plusone {
	@Test
  public void example1() {
	  int[] digits= {9,9,9};
	  addone(digits);
  }

	private void addone(int[] digits) {
	   int num=0;
	   for(int nums:digits)
	   num= (num*10)+nums;
		//System.out.println(num);	   
		num=num+1;
		//System.out.println(num);
		String S1[]=Integer.toString(num).split("");
		int output[]=new int[S1.length];
		int i=0;
		for(String temp:S1) {
			output[i]=Integer.parseInt(temp);
			i++;
		}
		System.out.println(Arrays.toString(output));
	}
}