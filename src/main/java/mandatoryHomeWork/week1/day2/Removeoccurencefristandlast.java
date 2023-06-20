package mandatoryHomeWork.week1.day2;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

/*
 * create 2 variables and assign left =0; right=length-1
 * Traverse through each element in an array and check left==0 then break
 * same for right
 * assign count=0 for left and right
 */

public class Removeoccurencefristandlast {

	@Test
	public void example1() {
		int[] num = { 0, 1, 2, 3, 4, 5, 1 };
		int val = 1;
		removeoccurence(num, val);
	}

	private void removeoccurence(int[] num, int val) {
		int left = 0, right = num.length - 1;
		int countL=0, countR=0;
		List<Integer> lst = new ArrayList<>();
		for (int i = 0; i < num.length; i++) {
			//System.out.print(num.length/2);
                if(num[left] != val){
			      lst.add(num[left]);
			      left++;
			}  
                else if(countL==0) {
                	//lst.add(num[left+1]);
                	countL=countL+1;
                	left++;
                }
           //  for (int j = 0; j < num.length/2; j++) {
                	if(num[right] != val){
      			     // lst.add(num[left+1]);
      			      right--;
      			}
                	else if(countR==0) {
                    	//lst.add(num[left+1]);
                    	countR=countR+1;
                    	//left++;
                      }
    }
		System.out.print(lst);
			/*else if(num[left] != val || num[right]==val){
				  lst.add(num[left]);
				  right--;
				}
			else {
				left++;
				right--;
			} */
		}
}
//}
