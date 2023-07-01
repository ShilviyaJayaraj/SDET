package mandatoryHomeWork.week4.day5;

import java.util.Stack;

import org.junit.Test;

public class crawlerLogFolder {
	@Test
	public void test() {
		String [] str = {"d1/","d2/","../","d21/","./"};
	
		crawLogFolder(str);
	}

	private void crawLogFolder(String[] str) {
	Stack<String> st = new Stack<String>();
		
		for (int i = 0; i < str.length; i++) {
			boolean isal = Character.isAlphabetic(str[i].charAt(0)) ||Character.isDigit(str[i].charAt(0)) ;
			if(str[i].contains("../")&& !st.isEmpty()) {
				st.pop();
			}
			else if(str[i].contains("./")&& !st.isEmpty()) {
				st.peek();
			}
			else if(isal) {
				st.push(str[i]);
			}
		}
		int count=0;
		while(!st.isEmpty()) {
			st.pop();
			count++;
		}
		
		System.out.println(count);
		
	}
}
