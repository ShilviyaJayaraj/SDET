package mandatoryHomeWork.week3.Day3;

import java.util.Arrays;
import java.util.HashMap;

import org.junit.Test;

public class Sortthepeople {
     @Test
     public void example1() {
    	 String[] S={"Alice","Bob","Bob"};
    	 int[] heights= {155,185,150};
    	 sortpeople(S, heights);
     }

	private void sortpeople(String[] S, int[] heights) {
		/*
		 * int[] H=new int[heights.length]; String S1[]=new String[S.length]; int i=0;
		 * for(;i<heights.length-1;i++) { if(heights[i]<heights[i+1]) { int
		 * temp=heights[i+1]; heights[i+1]=heights[i]; heights[i]=temp; H[i]=i+1; //
		 * H[i+1]=i-1; } else { H[i]=i; } } H[heights.length-1]=i-1; i=0;
		 * System.out.print(Arrays.toString(H)); for(;i<H.length;i++) { S1[i]=S[H[i]];
		 * //System.out.print(S1[i]); } System.out.print(Arrays.toString(S1));
		 */
		
		HashMap<Integer, String> hm=new HashMap<>();
		for(int i=0; i<heights.length;i++) {
			hm.put(heights[i], S[i]);
		}
		System.out.println(hm);
		Arrays.sort(heights);
		int index=0;
		System.out.println(Arrays.toString(heights));
		 for(int i=heights.length-1; i>=0; i--) {
			 S[index]=hm.get(heights[i]);
			 index++;
		 }
		 System.out.print(Arrays.toString(S));
		}
	}