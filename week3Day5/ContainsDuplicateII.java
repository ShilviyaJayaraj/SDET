package week3Day5;

import org.junit.Test;

public class ContainsDuplicateII {
    @Test
    public void example1() {
    	int[] nums= {1,2,3,1,2,3};
    	int k=2;
    	System.out.print(containsDupl(nums, k));
    }

	private boolean containsDupl(int[] nums, int k) {
		//int left=0, right=nums.length-1;
		int left=0, right=1;
		boolean out=false;
		while(right<nums.length) {
			if(nums[left]==nums[right]) {
				int val=Math.abs(left-right);
				if(val<=k){
				  out= true;
				}
				left++;
				right++;
			}
			else if(right==nums.length-1 && nums[left]!=nums[right]) {
				left++;
			}
            else{
				
				right++;
			}
		}
		return out;
	}
}
