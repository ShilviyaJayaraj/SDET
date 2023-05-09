package week3Day1;

/*
 * store 1st 3 characters and ensure all 3 char are not equal,
 * if, not equal increment count value +1
 * else swap ch1 as ch2 and ch2 as ch3 and for ch3 add i value
 * return good string count
 */

import org.junit.Test;

public class Substringdistinctchar {
         @Test
         public void example1() { 	 
        	 String S="a";
        	 int k=3;
        	 substrsliding(S, k);
      
         }

		@Test
         public void example2() { 	 
        	 String S="aababcabc";
        	 int k=3;
        	 substrsliding(S, k);
         }
         
         @Test
         public void example3() { 	 
        	 String S="xyzzaz";
        	 int k=3;
        	 substrsliding(S, k);
         }

         @Test
         public void example4() { 	 
        	 String S="";
        	 int k=3;
        	 substrsliding(S, k);
         }

         
		private void substrsliding(String S, int k) {
		     int count=0;
		    char ch1,ch2,ch3;
		     if(S.length()>k) {
		    	 ch1=S.charAt(0);
		    	 ch2=S.charAt(1);
		    	 ch3=S.charAt(2);
		    	 if(ch1!=ch2 &&  ch2!=ch3 && ch1!=ch3) {
		    		 count++;
		    	 }
		    	 System.out.println(ch1+" "+ch2+" "+ch3);
		     for(int i=3; i<S.length();i++) {
		    	    ch1=ch2;
		    	    ch2=ch3;
		    	    ch3=S.charAt(i);
		    	    System.out.println(ch1+" "+ch2+" "+ch3);
		    	    if(ch1!=ch2 &&  ch2!=ch3 && ch1!=ch3) {
			    		 count++;
			    	 }
		     }
		     }
		     if(S.length()<k) {
		    	 System.out.println("String length is less than k");
		     }
		     System.out.println("Good Substring in an given String - "+count);
		}
}
