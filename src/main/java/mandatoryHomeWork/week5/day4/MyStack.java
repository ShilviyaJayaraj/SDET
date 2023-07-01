package mandatoryHomeWork.week5.day4;

import java.util.*;
import org.junit.Test;

public class MyStack {

	public static void main(String[] args) {
		MyStack obj1 = new MyStack();
		 
		 obj1.push(1);
		 obj1.push(2);
		 int p2 = obj.pop();
		 int p3 = obj.top();
		 boolean p4 = obj.empty();
	}
	
	  Queue<Integer> st = new ArrayDeque<>();
		    public MyStack() {
		    	
		    }
		    public void push(int x) {
		    	st.add(x);
					for(int i = 1;i<st.size();i++) {
		    		st.add(st.remove());
		    	}
		    }
		    
		    public int pop() {   	
				return st.remove();   
		    }
		  
		    public int top() {
				return st.peek();
		        
		    }
		    public boolean empty() {
		    	if(st.isEmpty()) {
		    		return true;
		    	}
				return false;
		        
		    }
}
