package week2.Day2;

import java.util.Arrays;

import org.junit.Test;

public class RemoveElement {

	@Test
	public void example1() {
		int[] nums= {1,4,5,6,7,2,2,3,0,2};
		int val=2;
		System.out.print(remElem(nums, val));
	}

	private int remElem(int[] nums, int val) {
		int k=0,j=0;
		int[] out=new int[nums.length-1];
	//	System.out.print(nums.length);
	if(nums.length>1) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=val) {
				k=k+1;
				out[j++]=nums[i];
			}
			/*
			 * else { out[j]=nums[i]; }
			 */
		}
		System.out.println(Arrays.toString(out));
	}
	else System.out.println(Arrays.toString(nums));
 	return k;	
	}
}
