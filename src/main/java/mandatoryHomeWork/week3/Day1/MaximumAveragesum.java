package mandatoryHomeWork.week3.Day1;

import org.junit.Test;

/*
 * if given array length is greater than or equal k, then calculate
 * sum of k values and then iterate to next sliding window by
 * adding next value and removing 1st value
 * store the sum and divide it by k value and return the max average sum
 */

public class MaximumAveragesum {
      @Test
      public void example1() {
    	  int[] nums= {1,12,-5,-6,50,3};
    	  int k=4;
    	 System.out.println(maxAvgSum( nums, k));
      }

	private double maxAvgSum(int[] nums, int k) {
		int sum=0;
		double firstavgsum=0;
		double maxavgsum;
		//double max = 0;
		if(nums.length>=k) {
			for(int i=0;i<k;i++) {
				sum+=nums[i];
			}
			//System.out.println(sum);
			firstavgsum=sum/k;
			//System.out.println(firstavgsum);
             for(int i=1;i<=nums.length-k;i++) {
			    sum=sum+nums[i+k-1]-nums[i-1];
			    maxavgsum=sum/k;
			    if(firstavgsum<maxavgsum) {
					   // max=Math.max(maxavgsum,firstavgsum);
					    firstavgsum=maxavgsum;
			    }
				/*
				 * else { max=Math.max(maxavgsum,firstavgsum); }
				 */
			    }
		}
		 return firstavgsum;
		
	}
}
