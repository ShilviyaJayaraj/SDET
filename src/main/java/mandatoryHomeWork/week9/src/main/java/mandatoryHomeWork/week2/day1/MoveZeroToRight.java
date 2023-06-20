package mandatoryHomeWork.week2.day1;

import java.util.Arrays;

import org.junit.Test;

public class MoveZeroToRight {
  @Test
  public void movezero() {
	  int[] nums= {0,1,0,3,0,12,0,6,7,0,8};
	  zeroToRight(nums);
  }

private void zeroToRight(int[] nums) {
	int left=0, right=1;
	int temp;
	while(right<nums.length) {
		if(nums[left]!=0 && nums[right]!=0) {
			left++;
			right++;
		}
		else if(nums[left]==0 && nums[right]==0)
			right++;
		else {
			temp=nums[left];
			nums[left++]=nums[right];
			nums[right++]=temp;
		}
	}
	System.out.print(Arrays.toString(nums));
}
}
