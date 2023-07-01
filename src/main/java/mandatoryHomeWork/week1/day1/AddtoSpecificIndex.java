package mandatoryHomeWork.week1.day1;

import java.util.Arrays;

import org.junit.Test;

public class AddtoSpecificIndex {
       @Test
       
      public void example1() {
       int[] nums = { 1, 2, 3, 5, 6, 7, 9 };
		int target = 8;
		specificIndex(nums, target);
       }

	private void specificIndex(int[] nums, int target) {
		int[] out=new int[nums.length+1];
		int i=0;
		for(;i<nums.length;i++) {
			if(nums[i]<target) {
				out[i]=nums[i];
			}
			else {
				out[i]=target;
				break;
			}
			
		}
		for(;i<out.length-1;i++) {
			out[i+1]=nums[i];
		}
		
		System.out.print(Arrays.toString(out));
		
	}
}
