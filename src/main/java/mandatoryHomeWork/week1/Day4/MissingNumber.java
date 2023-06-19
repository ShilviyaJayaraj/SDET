package week1.Day4;

import org.junit.Test;

/*
 * 2pointer
 * assign 2 variables with one as 0 and other as length-1 --> to get the length
 * loop should execute till last index
 * check left and right element equals length eg: length 9 then check element equals 9
 * if equals decrement the length (eg: 8)
 * else, increment, both
 */

public class MissingNumber {
   @Test
   public void example1() {
	   int[] nums= {3,0,1};
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