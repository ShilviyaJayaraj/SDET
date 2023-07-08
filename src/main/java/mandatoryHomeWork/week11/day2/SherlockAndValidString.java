package mandatoryHomeWork.week11.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SherlockAndValidString {
	@Test
	public void example1() {
		String s="aabbcd";
		System.out.println(isValid(s));
	}

       
	public static String isValid(String s) {
	    List<Integer> ls = new ArrayList<Integer>();
	    char[] strArr=s.toCharArray();
	    Arrays.sort(strArr);
	    int left=0, right=0, count=0;
	    boolean flag=true;
	    
	    while(right<strArr.length){
	         if(strArr[left]==strArr[right]){
	            count++;
	            right++;
	    }
	         else{
	             //list is empty so adding for the 1st time
	             if(ls.size()==0){
	                 ls.add(count);
	             }
	             else{
	                 if(ls.contains(count)){
	                     ls.add(count);
	                 }
	                 else{
	                     int diff=Math.abs(ls.get(0)-count);
	                     //diff==1 means removing 1 elemnt is fine
	                     //count==1 means there is only 1 element so removal is fine
	                     //using flag, bcz only one time this step should happen
	                     if((diff==1 || count==1) && flag){
	                         //ls.add(ls.get(0));
	                         flag=false;
	                     }
	                     else return "No";
	                 }
	             }
	             left=right;
	             count=0;
	    }
	    }
	    
	     if(ls.contains(count)){
	                     ls.add(count);
	                 }
	        else{
	                     int diff=Math.abs(ls.get(0)-count);
	                     if((diff==1 || count==1) && flag){
	                       //  ls.add(count-diff);
	                         flag=false;
	                     }
	                     else return "NO";
	                 }
	                 
	   return "YES";
	    }
}
