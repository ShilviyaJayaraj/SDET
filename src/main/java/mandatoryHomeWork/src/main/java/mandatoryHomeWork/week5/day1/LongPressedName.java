package mandatoryHomeWork.week5.day1;

import org.junit.Test;

/*
 *Compare all the elements present in input is available in typed  
 * if it is present return true
 * else false
 */
public class LongPressedName {
      @Test
      public void example1() {
    	  String name="alex";
    	  String typed="aaleex";
    	  System.out.println(longPressedNameMatch(name, typed));
      }

      @Test
      public void example2() {
    	  String name="saeed";
    	  String typed="ssaaeddee";
    	  System.out.println(longPressedNameMatch(name, typed));
      }
      @Test
      public void example3() {
    	  String name="";
    	  String typed="ssaaedd";
    	  System.out.println(longPressedNameMatch(name, typed));
      }
      

      
	private Boolean longPressedNameMatch(String name, String typed) {
		int max=Integer.max(name.length(), typed.length());
		Boolean longpressed=false;
		if(name.length()>0) {
		int left=0, right=0;
		while(right<max) {
			if(name.charAt(left)==typed.charAt(right)) {
				longpressed=true;
				left++;
				right++;
				continue;
			}
			if(left>0 && name.charAt(left-1)==typed.charAt(right))
				right++;
			else 
				return false;
		if(name.length()!=left && typed.length()==right) {
		    return false;
		}
		
	}
		}
		else {
			System.out.print("Name is null so longpressed is ");
		}
		return longpressed;
}
}