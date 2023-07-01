package mandatoryHomeWork.week4.day2;

import org.junit.Test;

public class BlackSpacsStringCompare {
	@Test
	public void example1() {
		String s = "ab#c";
		String t = "ad#c";
		System.out.println(backSpaceString(s,t));
	}
	
    @Test
	public void example3() {
		String s = "a#c";
		String t = "b";
		System.out.println(backSpaceString(s,t));
	}

	public boolean backSpaceString(String s, String t) {
		Stack st=new Stack();
	
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!='#') {
				st.push(s.charAt(i));
			}
			else {
				//System.out.println(st.pop());
				st.pop();
			}
		}
		s="";
		int si=st.size();
		for(int i=1;i<=si;i++) {
			//System.out.println(st.pop());
			s=st.pop()+s;
		}
		//System.out.println(s);
		
		for(int i=0;i<t.length();i++) {
			if(t.charAt(i)!='#') {
				st.push(t.charAt(i));
			}
			else {
				//System.out.println(st.pop());
				st.pop();
			}
		}
		t="";
		int ti=st.size();
		for(int i=1;i<=st.size();i++) {
			//System.out.println(st.peek(i));
			t=st.peek(i)+t;
		}
		//System.out.println(t);
		
		if(s.equals(t)) return true;
		return false;
	}
	
	
	private boolean backSpaceStringCompare(String s, String t) {
		StringBuilder sb= new StringBuilder();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!='#') {
				sb.append(s.charAt(i));
				count=i;//2
			}
			else {
				//sb.deleteCharAt(i);
				//count--;//1
				sb.deleteCharAt(count);
				count--;
			}
		}
		System.out.println(sb);
		StringBuilder sbt= new StringBuilder();
		count=0;
		for(int i=0;i<t.length();i++) {
			if(t.charAt(i)!='#') {
				sbt.append(t.charAt(i));
				count=i;
			}
			else {
				//sbt.deleteCharAt(i);
				count--;
			}
		}
		
		System.out.println(sbt);
		s=sb.toString();
		t=sbt.toString();
		if(s.equals(t)) {
			return true;
		}
		
		return false;
		
		
	}

}

class Stack {
	private int size = 50;
	private Integer stack[] = new Integer[size];
	private int top = 0;

	public boolean push(Character Element) {
		if (top < size) {
			stack[top] = Element;
			top++;
			return true;
		}
		return false;

	}

	Integer pop() {
		Integer Element = 0;
		if (top != 0) {
			Element = stack[top - 1];
			top--;
		}
		return Element;
	}

	Integer peek() {
		Integer Element = 0;
		if (top != 0) {
			Element = stack[top - 1];
		}
		return Element;
	}
	Integer peek(int index) {
		Integer Element = 0;
		if (top != 0) {
			Element = stack[top - index];
		}
		return Element;
	}

	
	Integer size() {
		return top;
	}
}
