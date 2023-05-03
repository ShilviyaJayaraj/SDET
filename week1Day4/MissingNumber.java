package week1Day4;

import org.junit.Test;

/*
 * Declare the array
 * and loop until length-1
 * For sorted array and non sorted
 */

public class MissingNumber {
   @Test
   public void example1() {
	   int[] nums= {9,6,4,2,3,5,7,0,1};
	   Missingumber(nums);
   }
private void Missingumber(int[] nums) {
	int j=nums.length;
	int left=0,right=nums.length-1;
	while(left<right) {
		if(nums[left]==j || nums[right]==j) {
			j--;
			//System.out.print("Missing number is :"+j);
		}
		else {
			left++;
			right--;
		}
		 }
	 System.out.print("Missing number is :"+j);
	}
}
