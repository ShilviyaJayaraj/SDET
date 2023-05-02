package week2Day1;

import java.util.Arrays;

import org.junit.Test;

public class RemDuplicatereturncount {
    @Test
    public void Rmduplicate() {
    	int[] nums= {1,1,2,2,3,4,5,5,6,7}; //sorted array
    	returncount(nums);
    }

	private void returncount(int[] nums) {
		int[] out=new int[nums.length];
	     int left=0, right=1,i=0,count=0;
	     while(right<nums.length) {
	    	 if(nums[left]==nums[right]) {
	    		 left++;
	    		 right++;
	    	 }
	    	 else if(nums[left]!=nums[right]) {
	    		 out[i++]=nums[left];
	    		 left++;
	    		 right++;
	    		 count=count+1;
	    	 }
	     }
	    	 if(right==nums.length) {
	    		 out[i++]=nums[right-1];
	    		 count=count+1;
	    	 }
	  System.out.println(count);
	 System.out.println(Arrays.toString(out));
	}
}