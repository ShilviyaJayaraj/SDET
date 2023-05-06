package week2Day5;

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
	   int[] num1= {1,2,3};
	   int[] num2= {2,5,6}; // { 1,2,2,3,5,6}
	   mergeSortedArr(num1, num2);
   }

private void mergeSortedArr(int[] num1, int[] num2) {
	       int[] out=new int[num1.length+num2.length];
	       int pt1=0, pt2=0, i=0;
	     //  System.out.print(out.length);
	       while(pt1<num1.length || pt2<num2.length){
	    	// if(pt1==num1.length)  
	    	   if(num1[pt1]<num2[pt2]) {
	    		 //  if()
	    		   out[i++]=num1[pt1++];
	    	   }
	    	 /*  else if(num1[pt1]==num2[pt2]) {
	    		*   out[i++]=num1[pt1++];
	    		 *  out[i++]=num1[pt2++];
	    	   }*/
	    	   else {
	    		   out[i++]=num1[pt2++];
	    	   }
	       }
	       System.out.print(Arrays.toString(out));
}
}
