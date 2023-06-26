package mandatoryHomeWork.week2.day5;

import java.util.Arrays;

import org.junit.Test;

/*
 * Length of new array should be arr1+arr2
 * assign two pointer for 2 input arrays
 * if(arr1(pointer1) < arr2(pointer2)) --> add arr1(pointer1) to new array and increment pointer 1
 * else if(arr1(pointer1) == arr2(pointer2)) --> then add arr1(pointer1) and arr2(pointer2) and increment both
 * 
 * 
 */


public class Mergesortedarray {
   @Test
   public void example1() {
	   int[] num1= {1,2,3,0,0,0};
	   int[] num2= {2,5,6}; // { 1,2,2,3,5,6}
	   mergeSortedArr(num1, num2);
   }

  // @Test
   public void example2() {
	   int[] num1= {1};
	   int[] num2= {}; // { 1,2,2,3,5,6}
	   
	   mergeSortedArr(num1, num2);
   }
   
private void mergeSortedArr(int[] num1, int[] num2) {
	    int pointer1=0;
	    int pointer2=0;
	    int m=1;
		int n=0;
	    	//System.out.println(Arrays.toString(num1));
	    while(pointer1 < num1.length) {
	    	if(num1[pointer1]>num2[pointer2]) {
	    		int temp=num1[pointer1];
	    		num1[pointer1++]=num2[pointer2];
	    		num2[pointer2]=temp;
	    	//	System.out.println("first if ");
	    		//System.out.println(Arrays.toString(num1));
		    	//System.out.println(Arrays.toString(num2));
	    	}
	    	
	    		if(num1[pointer1]<=num2[pointer2] && num1[pointer1]>0) {
		    		pointer1++;
		    		//System.out.println("seconf if ");
		    		//System.out.println(Arrays.toString(num1));
			    	//System.out.println(Arrays.toString(num2));
	    	}
	    	if(num1[pointer1]==0) {
	    		int temp=num1[pointer1];
	    		num1[pointer1++]=num2[pointer2];
	    		num2[pointer2++]=temp;
	    		//System.out.println("third if ");
	    		//System.out.println(Arrays.toString(num1));
		    	//System.out.println(Arrays.toString(num2));
	    	}
	    	//System.out.println(Arrays.toString(num1));
	    	//System.out.println(Arrays.toString(num2));
	    }

	    System.out.println(Arrays.toString(num1));
}
}
