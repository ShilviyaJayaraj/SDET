package Week6.Day1;

import org.junit.Test;

/*
 * Get the length of needle
 * loop till iterator is less that haystack.length
 * check haystack matches with needle
 * if it matched return 1st index
 * else return -1
 * 
 */


public class IndexofFirstOccurenceInString {
   @Test
    public void example1() {
    	String haystack = "sadbutsad";
    	String needle = "sad";
    	System.out.println(firstOcurrenceIndex(haystack, needle));
    }
    
    @Test
    public void example2() {
    	String haystack = "asadbutsad";
    	String needle = "sad";
    	System.out.println(firstOcurrenceIndex(haystack, needle));
    }
    
    @Test
    public void example3() {
    	String haystack = "leetcode";
    	String needle = "leeto";
    	System.out.println(firstOcurrenceIndex(haystack, needle));
    }

	private int firstOcurrenceIndex(String haystack, String needle) {
		int i=0;
		int length=needle.length();
	    int index=0;
	    String out="";
		StringBuffer sb=new StringBuffer(length);
		for(i=0;i<length;i++) {
			sb.append(haystack.charAt(i));
			
		}
		out=sb.toString();
		//System.out.println(compare);
		if(out.equals(needle)) {
			index=i-length;
			return index;
		   // System.out.print("first loop");
		}
		
		else {
			out="";
		//	System.out.println("sb initial  - "+sb.toString());
		while(i<haystack.length()) {
			out="";
			//System.out.println(i);
			sb.deleteCharAt(i-length);
			//System.out.println("deletechar  - "+sb.toString());
		    sb.append(haystack.charAt(i));
		 //   System.out.println("append -"+sb.toString());
		    out=sb.toString();
		//System.out.println("compare - "+out);
		   if(out.equals(needle)) {
		//	System.out.println("while");
			index=i-(length-1);
			break;
		}
		   i++;
		}
		
		}
		if(index==0) {
			return -1;
		}
		return index;
	}
}
