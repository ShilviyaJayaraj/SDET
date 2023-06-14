package week2.Day3;

import org.junit.Test;

public class Maximumproduct {
	@Test
	public void example1() {
		int[] nums= {3,7};
		maxproduct(nums);
	}

	private void maxproduct(int[] nums) {
		int i=0, j=0;
		for(int n:nums) {
			if(n>i) {
				j=i;
				i=n;
			}
			else if(n>=i) {
				j=n;
			}
		}
		//System.out.print("Highest number"+i+" "+"second highest number"+j);
		int out=(i-1)*(j-1);
		System.out.print(out);
	}

}
