package mandatoryHomeWork.week9.day1;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TwoStack {
	@Test
	public void example() {
	   int maxSum=10;
       List<Integer> onestack=Arrays.asList(4, 2, 4, 6, 1);
       List<Integer> twostack=Arrays.asList(2, 1, 8, 5);
       twoStackProblem(maxSum,onestack,twostack);
	}

	private int twoStackProblem(int maxSum, List<Integer> onestack, List<Integer> twostack) {
		 int val=0, left=0, right=0,count=0;
	        while(left<onestack.size() && right<onestack.size()){
	            if(val<maxSum){
	                val=val+onestack.get(left);
	                left++;
	                count++;
	            }
	            if(val<maxSum){
	                val=val+twostack.get(right);
	                right++;
	                count++;
	            }
	            else{
	                return count-1;
	            }
	            
	        }
	        while(left<onestack.size()){
	            if(val<maxSum){
	                val=val+onestack.get(left);
	                left++;
	                count++;
	            }
	            else return count-1;
	        }
	        while(right<onestack.size()){
	            if(val<maxSum){
	                val=val+onestack.get(right);
	                right++;
	                count++;
	            }
	            else{
	                return count-1;
	            }
	        }
	        return count;
	    }
		
	}
