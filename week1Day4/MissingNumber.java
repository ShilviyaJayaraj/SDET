package week1Day4;

import org.junit.Test;

/*
 * Declare the array
 * and loop until length-1
 * For sorted array add +1 and check
 */

public class MissingNumber {
   @Test
   public void example1() {
	   int[] nums= {-1,0,2,3,4,5};
	   Missingumber(nums);
   }
private void Missingumber(int[] nums) {
	
	for (int i=0; i<nums.length;i++) {
		int j=0;
		 j=nums[i]+1;
		 if(nums[i+1]!=j) {
			 System.out.print("Missing number is :"+j);
		 }
	}
}
}