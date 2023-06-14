package week3.Day5;

import org.junit.Test;
import java.util.*;
/*
 * Input: nums = [3,2,3]
 * initialize count=1
 * left =0, right=nums.length
 * if nums[left]==nums[right] count=count+1;
 * and store the value in list
 * loop till left<right
 * iterate loop till nums.length and check 
 * 
 * 
 */

public class MajorityElement {
      @Test
      public void example1() {
    	  int[] nums= {3,3,4};
    	  System.out.println(majorityEle(nums));
      }
     @Test
      public void example2() {
    	  int[] nums= {2,2,1,1,1,2,2};
    	  System.out.println(majorityEle(nums));
      }

	private int majorityEle(int[] nums) {
		
		/*
		 * int count=0; int out=0; Object[] h = null; int n=nums.length-1;
		 * HashSet<Integer> hs=new HashSet<>(); int left=0, right=nums.length-1;
		 * hs.add(nums[0]); //System.out.println(hs); if(nums.length>1) {
		 * while(left<right) { if(nums[left]==nums[right]) {
		 * if(hs.contains(nums[left])){ hs.add(nums[left]); out=nums[left]; //
		 * System.out.println("hs not contains"+hs); count=count+2; } else { //
		 * hs.remove(nums[left]); // count=count+2; if(count>(n/2)) { h=hs.toArray();
		 * out=(int) h[0]; }
		 * 
		 * // hs.add(nums[left]); } left++; right--; } } } else { h=hs.toArray();
		 * out=(int) h[0]; } return out; }
		 */
		
		
		
		
		
		int count=0;
		int out=0;
		Object[] h = null;
		int n=nums.length-1;
		HashSet<Integer> hs=new HashSet<>();
		int left=0, right=nums.length-1;
		hs.add(nums[0]);
		//System.out.println(hs);
	if(nums.length>1) {
		while(left<right) {
			if(nums[left]==nums[right]) {
			 if(hs.contains(nums[left])){
				 hs.add(nums[left]);
				 out=nums[left];
				// System.out.println("hs not contains"+hs);
				 count=count+2;
			 }
			 else {
				// hs.remove(nums[left]);
				// count=count+2;
				 if(count>(n/2)) {
					h=hs.toArray();
					out=(int) h[0];
				 }
				 
				// hs.add(nums[left]);
			 }
				left++;
				right--;
			}
		}
	}
		else {
			h=hs.toArray();
			out=(int) h[0];
		}
		return out;
	}
      
}
