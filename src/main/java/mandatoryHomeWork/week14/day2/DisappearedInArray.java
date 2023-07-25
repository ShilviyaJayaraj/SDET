package mandatoryHomeWork.week14.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;


/*
 * 448. Find All Numbers Disappeared in an Array
 * Store length in variable and store it in hashset
 * then compare it with nums, if nums[i] matches with hashset then remove it
 * return hs
 */
public class DisappearedInArray {
    
	@Test
	public void example1() {
		int[] nums= {4,3,2,7,8,2,3,1};
		System.out.println(disappearedNums(nums));
	}

	@Test
	public void example2() {
		int[] nums= {1,1};
		System.out.println(disappearedNums(nums));
	}

	
	private HashSet<Integer> disappearedNums(int[] nums) {
		List<Integer> ls=new ArrayList<>();
		HashSet<Integer> hs=new HashSet<>();
		int length=nums.length;
		for(int i=1;i<=length;i++) {
			hs.add(i);  
		}
		for(int i=0;i<nums.length;i++) {
			if(hs.contains(nums[i])) {
				hs.remove(nums[i]);
			}
		}
		return hs;
	}
}
