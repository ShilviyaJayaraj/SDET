package Week1Day3;

import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

public class Removeoccurence {
	@Test
	public void example1() {
		int[] num = {1,2,3,4,5,1};
		int indextoremove = 5;
		removevalue(num, indextoremove);
	}

	private void removevalue(int[] num, int indextoremove) {
		int val = num[indextoremove];
		List<Integer> lst = new ArrayList<Integer>();
		for (int i = 0; i < num.length; i++) {
			if (num[i] != val) {
				lst.add(num[i]);
			}
		}
		System.out.print(lst);
	}
}
