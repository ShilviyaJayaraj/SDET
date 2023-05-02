package week1Day1;

/*
 * check no.of rows and coulmns has space
 * i=0; j=5 check j>=1 and j>1  print space
 *  else print _*
 */


public class pyramidpatter {
	public static void main (String[] args) {
     for (int i=0; i<=5;i++) {
    	 for (int j=5; j>=1; j-- ) {
    		 if(j>i) {
    			 System.out.print(" ");
    		 }
    		 else {
    			 System.out.print(" *");
    		 }
    	 }
    	 System.out.println();
     }
     }
	  
}
