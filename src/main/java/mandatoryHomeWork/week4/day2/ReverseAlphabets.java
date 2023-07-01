package mandatoryHomeWork.week4.day2;

import org.junit.Test;

public class ReverseAlphabets {
	@Test
	public void positive() {
		String s = "asd@#$@12efrdf312s*(^&*dsd";
		System.out.println(reversAlpha(s));
	}
	
	
    @Test
	public void edge() {
    	String s = "abcfh*jllll";
		System.out.println(reversAlpha(s));
	}
    
    //Time Complexity --> O(n/2)-->O(n)
    //Space Complexity --> O(n)
    private String reversAlpha(String s) {
		
    	StringBuilder sb= new StringBuilder(s);
    	int left=0;
    	int right=s.length()-1;
    	char temp;
    	while(left<=right) {
    		if(Character.isLetter(sb.charAt(left)) && Character.isLetter(sb.charAt(right))) {
    			temp=sb.charAt(right);
    			sb.setCharAt(right--, sb.charAt(left));
    			sb.setCharAt(left++, temp);
    		}
    		else if(!Character.isLetter(sb.charAt(left))) left++;
    		else if(!Character.isLetter(sb.charAt(right))) right--;
    	}
    	
		return sb.toString();
	}
}
