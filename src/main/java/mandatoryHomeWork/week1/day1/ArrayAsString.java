package mandatoryHomeWork.week1.day1;

import org.junit.Test;

public class ArrayAsString {
	@Test
	public void positive() {
		int[] arr= {5,6,8,9};
		printingString(arr);
	}

	private void printingString(int[] arr) {
		String str="";
		
		for(int each:arr) {
			str=str+each;
		}
		
		System.out.print(str);
		
	}
	
	
	
}
