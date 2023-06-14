package week3.Day5;

import java.util.HashMap;

import org.junit.Test;

public class ContainsDuplicateII {
    @Test
    public void example1() {
    	int[] nums= {1,2,3,1,2,3};
    	int k=2;
    	//System.out.println(containsDupl(nums, k));
    	System.out.println(containsDuplII(nums, k));
    }
    
    private boolean containsDuplII(int[] nums, int k) {
		boolean out=false;
		HashMap<Integer, Integer> hm=new HashMap<>();
		for(int i=0; i<nums.length; i++){	
		    if(!(hm.containsKey(nums[i]))) {
		       hm.put(nums[i],i);
		    }
		    else {
		    	int val=Math.abs(i-(hm.get(nums[i])));
		    	if(val<=k) {
		    		out=true;
		    	}
		    }
	
		}
		return out;
	}

//	@Test
    public void example2() {
    	int[] nums= {1,0,1,1};
    	int k=1;
    	System.out.println(containsDupl(nums, k));
    }
   
  //  @Test
    public void example3() {
    	int[] nums= {1,2,3,1};
    	int k=3;
    	System.out.println(containsDupl(nums, k));
    }
   @Test
    public void example4() {
    	int[] nums= {1,2};
    	int k=2;
    //	System.out.println(containsDupl(nums, k));
    	System.out.println(containsDuplII(nums, k));
    }
    
    
	private boolean containsDupl(int[] nums, int k) {
		//int left=0, right=nums.length-1;
		int left=0, right=1;
		boolean out=false;
		while(right<nums.length) {
			if(nums[left]==nums[right]) {
				int val=Math.abs(left-right);
				if(val<=k){
				  out= true;
				}
				left++;
				right++;
			}
			else if(right==nums.length-1 && nums[left]!=nums[right]) {
				left++;
			}
            else{
				
				right++;
			}
		}
		return out;
	}
}
