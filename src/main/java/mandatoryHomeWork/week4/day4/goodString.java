package mandatoryHomeWork.week4.day4;

import java.util.Stack;

import org.junit.Test;

public class goodString {
	@Test
	public void data() {
		String s = "leEeetcode";
		//System.out.println(goodstring(s));
		goodStringMethod(s);
	}
	
	public String goodStringMethod(String s) {
		
		StringBuilder  sp = new StringBuilder();
		Stack<Character> stack = new Stack<Character>();
		char [] ch =  s.toCharArray();
		stack.push(ch[0]);
		for (int i = 1; i < ch.length; i++) {
			if(stack.isEmpty()) {
				stack.push(ch[i]);
			}
			else if(stack.peek()-ch[i]==32) {
				stack.pop();
			}
			
			else stack.push(ch[i]);
		}
		
		while(!stack.isEmpty()) {
			sp.append(String.valueOf(stack.pop()));
		}
		
		return sp.reverse().toString();
	}
	
	public void goodstring2(String s){
		
		StringBuilder sp = new StringBuilder();
		char [] ch =  s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			
		}
		
		System.out.println(sp);
	}
}
