package Week6.Day2; 

import org.junit.Test;

public class MinimumCommonValue {
     @Test
     public void example1() {
    	 int[] num1= {1,2,3};
    	 int[] num2= {2,4,5};
    	 System.out.println(minCommonvalue(num1, num2));
     }
     
     @Test
     public void example2() {
    	 int[] num1= {1,2,3,6};
    	 int[] num2= {2,3,4,5};
    	 System.out.println(minCommonvalue(num1, num2));
     }
     @Test
     public void example3() {
    	 int[] num1= {1,2,3};
    	 int[] num2= {2,4};
    	 System.out.println(minCommonvalue(num1, num2));
     }

	private int minCommonvalue(int[] num1, int[] num2) {
		int ptr1=0, ptr2=0;
		int max=Integer.max(num1.length, num2.length);
		int min=Integer.MAX_VALUE;
		while(ptr1< max || ptr2<max) {
			//System.out.println("ptr1 - "+ ptr1+ "   ptr2   - " +ptr2);
			if(num1[ptr1]==num2[ptr2]) {
				min=Math.min(min,num1[ptr1] );
				ptr2++;
				//System.out.println(min);
			}
			else if(num1[ptr1]!=num2[ptr2] && num1[ptr1]<num2[ptr2] ) {
				//System.out.println(num1.length);
				if(ptr1<(num1.length)-1) {
					ptr1++;
					//System.out.println("ptr1 in first elseif ->if - "+ ptr1);
				}
				else if(ptr2<(num1.length)-1){
				ptr2++;
			//	System.out.println("ptr2 in first elseif ->if - "+ ptr2);
			//	System.out.println(min);
				}
			}
			else if(num1[ptr1]!=num2[ptr2] && num1[ptr2]<num2[ptr1]) {
				ptr2++;
			//	System.out.println("ptr2 in second elseif ->if - "+ ptr2);
			}
			
			if(ptr1==(num1.length)-1 && ptr2==(num2.length)-1){
				ptr1++;
				ptr2++;
				break;
			}
			
			/*
			 * if(num1.length<ptr1) { ptr2++; } else { ptr1++; }
			 */
		}
		return min;
	}
}
