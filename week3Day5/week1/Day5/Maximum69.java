package week1.Day5;

import java.util.Arrays;

public class Maximum69 {
 public static void main(String[] args) {
	 int num=9669;
	 int nums[]=new int[num];
	 int c=0;
	 for(;num>0;) {
		 nums[c++]=num%10;
	   // System.out.print(num/10);
		 num=num/10;
		 System.out.print(num/10);
		//System.out.print(Arrays.toString(nums));
	 }
	 int update=0;
	 
	 int count=0;
	 for(int i=0;i<nums.length;i++) {
		 if(count==0 && nums[i]==6) {
			 count=count+1;
			 nums[i]=9;
		 }
		 update=update*10+nums[i];
	 }
	 System.out.print(update);
 }
}
