package week1.Day1;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Methodsusingarray {
	
	@Test
	public void example1() {
		int[] nums= {1,2,3,4};
		addspecificindex(nums);
		arrayasstring(nums);
		containsnum(nums);
		removevalue(nums);
		trimlength(nums);
	}

	private void trimlength(int[] nums) {
		int trim=2;
		int arr[]=new int[trim];
		System.out.println("Trim to specific length");
		for(int i=0; i<trim; i++) {
			arr[i]=nums[i];
		}
		System.out.println(Arrays.toString(arr));
	}

	private void removevalue(int[] nums) {
		int remval=8;
		System.out.println("Remove given value from array : ");
		for(int i=0; i<nums.length; i++){
			if(nums[i]==remval) {
				nums[i]=nums[i+1];
			}
			else {
				System.out.print(nums[i]+",");
			}
		}
		System.out.println();
	}

	private void addspecificindex(int[] nums) {
		int numtoinsert=7;
		int index=4;
		List<Integer> lst=new ArrayList<>();
		System.out.println("Insert number to given index : ");
		for(int i=0;i<=index;i++) {
			if(i==index) {
				lst.add(numtoinsert);
			}
			else {
				lst.add(nums[i]);
			}
		}
		System.out.println(lst);
	} 
	
	private void arrayasstring(int[] nums) {
		System.out.println("Print array as string : ");
		  for (int i=0; i<nums.length;i++) {
			  System.out.print(nums[i]);
		  }
		  System.out.println();
		/*int conv = 0;
		for(int n:nums) {
			conv=conv*10+n;
		}*/
		//System.out.println(conv);
	}
	
	private void containsnum(int[] nums) {
		int value=2;
	    boolean b=false; 
	    System.out.println("Is array contains given number : ");
		for(int i=0; i<nums.length; i++) {
			if(nums[i]==value) {
			//System.out.println("Given value is present in an array");
				b=true;
			}
			}
		System.out.print(b);
		System.out.println();
	}
	
	
}
