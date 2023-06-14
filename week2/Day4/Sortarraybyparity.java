package week2.Day4;

import java.util.Arrays;

import org.junit.Test;

public class Sortarraybyparity {
		@Test
		public void example1() {
			int[] nums= {1,2,3,4,5,6,8};
			sortarray(nums);
		}

		private void sortarray(int[] nums) {
		     int left=0, right=0;
		     while(right<nums.length) {
		    	 if(nums[left]%2==0 || nums[right]%2==0) {
		    		 int temp=nums[left];
		    		 nums[left++]=nums[right];
		    		 nums[right++]=temp;
		    	 }
		    	 else {
		    		 right++;
		    	 }
		     }
			System.out.print(Arrays.toString(nums));
		}

}
