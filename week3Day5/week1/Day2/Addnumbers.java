package week1.Day2;

/*
 * As input is an integer , convert it to string array
 * And add each element in an array and store it in new array--> lemgth
 * then parse element in new array and add it (to parse string to int use 
 * Integer.ParseInt()
 * 
 */


public class Addnumbers {
   public static void main(String[] args) {
	   int num= 987;
	   int i=0,n=0;
	   String[] S=Integer.toString(num).split("");
		  for(String str:S) {
		     i=i+Integer.parseInt(str);
		  }
		 //System.out.println(i);
		  String[] arr = Integer.toString(i).split("");
		 // System.out.println(Arrays.toString(arr));
			   for(String out:arr) {
				  // for (;arr.length-1>0;k++) { 
				     n=n+Integer.parseInt(out);
				  }
			   System.out.println(n);
			  // System.out.println(k);
		     }
         }
	 //  }