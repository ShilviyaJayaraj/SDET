package mandatoryHomeWork.week3.day4;

import java.util.*;

import org.junit.Test;

/*
 * get charAt of last index of each word
 * create hashmap and add key as int and value as string
 * sort the index  -> {2,4,1,3} to { 1,2,3,4} 
 * then using sorted index get value from hashmap
 */

public class SentenceSorting {
    @Test
    public void example1() {
    	String S="is2 sentence4 This1 a3";
    	System.out.print('"'+sentenceSort(S)+'"');
    }

	private String sentenceSort(String S) {
	  String[] Strarr=S.split(" ");
	  HashMap<Character, String> hm=new HashMap<>();
	//  System.out.println(Arrays.toString(Strarr));
	   char[] index=new char[Strarr.length];
	   int i=0;
	   String output="";
	   int k=0;
	   for(String S1:Strarr) {
		   int a=S1.length()-1;
		  // System.out.println("  a  "+ a);
		   index[i]=S1.charAt(a);
		   Strarr[i]=S1.substring(0,a);
		//  System.out.println(S1.charAt(a));  
		   hm.put(index[i],Strarr[i]);
		  // System.out.println(hm);
		   i++;
	   }
	 //  System.out.println(Arrays.toString(index));
	//   System.out.println(Arrays.toString(Strarr));
	//   System.out.println(hm);
	   Arrays.sort(index);
	//   System.out.println(Arrays.toString(index));
	   for(int j=0; j<index.length;j++) {
		   Strarr[k]=hm.get(index[j]);
		//   System.out.println(Strarr[k]);
		   k++;
	   }
	   for(String Sout:Strarr) {
		   output+=Sout+" ";
		   }
	  return output;
	}
}
