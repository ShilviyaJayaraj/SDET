package week3Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    	int[] arr= {4,2,1,3};
    	minAbsDiff(arr);
    	//minDiffMethod(arr);
    }
 //   @Test
    public void example2() {
    	int[] arr= {9,4,1,7};
    	minDiffMethod(arr);
    }

	private void minDiffMethod(int[] arr) {
		int sub=0;
		int k=2;
		int max=Integer.MAX_VALUE;
		int min=0; 
		int minval=0;
		if(arr.length>k) {
			minval=arr[0]-arr[1];
			//System.out.println("minval"+minval);
		}
		//min=minval;
		//System.out.println(min);
		for(int i=0; i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length; j++) {  
			//	System.out.println("i-"+arr[i]+"j-"+arr[j]); // 9,4,1,7
				if(arr[i]<arr[j])
				{
					sub=arr[j]-arr[i];
					if(sub<minval) {
						min=Math.min(max, sub);
						//System.out.print("if"+min);
						minval=min;
					}
					}
				else {
					sub=arr[i]-arr[j];
				//	System.out.println("i-j ="+(arr[i]-arr[j]));
				//	System.out.println("else-minval"+minval);
					if(sub<=minval) {
						min=Math.min(max, sub);
						//System.out.println("else"+min);
						minval=min;
					}
					
				}
				}
		}
		System.out.println(min);
	}

	private void minAbsDiff(int[] arr) {
		int sub=0;
		List<List<Integer>> ls=new ArrayList<List<Integer>>();
		int min=Integer.MAX_VALUE;
		Arrays.sort(arr);    // 1,4,7,9
		for(int i=0;i<arr.length-1; i++) {	
				sub=arr[i+1]-arr[i];
			if(sub<min) {
				min=sub;
				ls.clear();
				ls.add(Arrays.asList(arr[i],arr[i+1]));
			}
			else if(sub==min) {
				ls.add(Arrays.asList(arr[i],arr[i+1]));
				
			}
			}
		System.out.println(ls);
		}
		
	}
