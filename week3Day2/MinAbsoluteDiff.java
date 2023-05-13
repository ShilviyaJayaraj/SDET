package week3Day2;

import java.util.Arrays;

import org.junit.Test;

/*
 * check arr[i] is less than arr[i+1] if it is lesser, then subract arr[i+1] - arr[i]
 * store it in min value and compare it with Math.min
 * once min is find
 * loop through each value and find diff equals min value
 * and return it
 * 
 * 
 */

public class MinAbsoluteDiff {
    @Test
    public void example1() {
    	int[] arr= {3,8,-10,23,19,-4,-14,27};
    	minAbsDiff(arr);
    	
    }

	private void minAbsDiff(int[] arr) {
		int min=0;
		int sub=0;
		int minval = arr[1]-arr[0];
		int max=Integer.MAX_VALUE;
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1; i++) {
			
			//System.out.println(max);
			
			if(arr[i]<=arr[i+1]) {
				sub=arr[i+1]-arr[i];
				//min=sub;
			if(minval<sub) {
				//min=sub;
				minval=Math.min(sub, max);
			}
			else {
				max=sub;
				/*
				 * minval=Math.min(min, max); min=minval; System.out.println(minval);
				 */
			}
			}
		}
		System.out.println(minval);
		sub=0;
		for(int i=0;i<arr.length-1;i++) {
			sub=arr[i+1]-arr[i];
			if(sub==minval) {
				System.out.print(arr[i]+","+arr[i+1]+",");
			}
		}
		
	
		//System.out.print(Arrays.toString(arr));
	}
}
