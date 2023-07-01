package mandatoryHomeWork.week5.day3;

import java.util.Stack;

public class ImplementQueueUsingStack {
static class MyQueue {
		
		Stack<Integer> st1 = new Stack<Integer>();
		Stack<Integer> st2 = new Stack<Integer>();
	    public MyQueue() {
	    	
	    }
	    
	    //Checking if the st1 is not empty and pushing the values to st
	    public void push(int x) {
	    	while(!st1.isEmpty()) {
	    		st1.push(st1.pop());
	    	}
	    	st1.push(x);
	    }
	    
	    //Checking if the st is not empty and removing the values to st and pushing it to st1
	    public int pop() {
	    	while(!st1.isEmpty()) {
	    		st2.push(st1.pop());
	    	}
	    	
			return st2.pop();
	        
	    }
	    public int peek() {
	    	while(!st1.isEmpty()) {
    		st2.push(st1.pop());
    	}
			return st2.peek();
	        
	    }
	    //Both the stacks are empty return true
	    public boolean empty() {
	    	if(st2.isEmpty() && st1.isEmpty()) {
	    		return true;
	    	}
			return false;
	        
	    }
	
}
	public static void main(String[] args) {
		MyQueue obj = new MyQueue();
		 
		 obj.push(1);
		 obj.push(2);
		 int param_2 = obj.pop();
		 int param_3 = obj.peek();
		 boolean param_4 = obj.empty();
	}
	
}
