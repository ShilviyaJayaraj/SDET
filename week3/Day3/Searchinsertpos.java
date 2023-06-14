package week3.Day3;

import org.junit.Test;

/*
 * left=0 , right = nums.length-1 (3)

mid=(left+right)/2   => 1

  1       3     5     6
left     mid         right

if(mid<target)

left=mid+1
 then check left<=target, if yes return index of value

else increment left>target then return index of value
 * 
 * 
 */

public class Searchinsertpos {
     @Test
     public void example1() {
    	 int[] nums= {1,3,5,6};
    	 int target=5;
    	 searchInsPos(nums, target);
     }
     @Test
     public void example2() {
    	 int[] nums= {1,3,5,6};
    	 int target=2;
    	 searchInsPos(nums, target);
     }
     @Test
     public void example3() {
    	 int[] nums= {1,3,5,6};
    	 int target=7;
    	 searchInsPos(nums, target);
     }
     @Test
     public void example4() {
    	 int[] nums= {1,3,5,6};
    	 int target=0;
    	 searchInsPos(nums, target);
     }


	private void searchInsPos(int[] nums, int target) {
		int left=0, right=nums.length-1;
		int mid;
		while(left<right) {	
			mid=(left+right)/2;
			//System.out.println("mid/2 - "+mid);
			if(nums[mid]==target) {
				System.out.println("val index-"+mid);
				break;
			}
			else if(nums[mid]<target && nums[left]<target){
				left=mid+1;
				//System.out.println("mid < target -"+left);
			}
			else if(nums[left]==target) {
				//System.out.print(left);
				left++;
				break;
			}
			/*
			 * else if(nums[right]==target || nums[right]<target){
			 * System.out.print(right+1); break; }
			 */
			else if(nums[left]>target) {
				System.out.println(left);
				break;
			}
			else {
				System.out.println("Given val is not present but insert position is - "+(mid));
				break;
			}
		}
		if(left==nums.length-1) {
			System.out.println(left+1);
		}
	}
}
