package week4.Day1;

import org.junit.Test;

public class stackimpl {

	@Test
	public void example1() {
		String[] ops = { "5","-2","4","C","D","9","+","+" };
		//System.out.print(baseBallGame(ops));
		baseBallGame(ops);
	}
	@Test
	public void example2() {
		String[] ops = { "5","2","C","D","+"};
		//System.out.print(baseBallGame(ops));
		baseBallGame(ops);
	}

	private void baseBallGame(String[] ops) {
          stack S=new stack();
          int sum=0;
          int size=-1;
          int num=0;
          int dble=0;
          for(int i=0;i<ops.length;i++) {
        	  try {
             	 num=Integer.parseInt(ops[i]);
             	 S.push(num);
             	 //System.out.println(num);
              }
             catch(Exception e) {
            	 char ch=ops[i].charAt(0);
            	 switch(ch) {
            	 case 'C':
            		 S.pop();
            		 size--;
            		 
            		 break;
            	 case 'D':
            		 dble=2*(S.peek());
            		 S.push(dble);
            		 size++;
            		 System.out.println("dble - "+dble);
                     break;
            	 case '+':
            	     int topele=S.pop();
            	     int previous=S.pop();
            	    System.out.println("topele-"+topele+"previous-"+previous);
            	     S.push(previous);
            	     S.push(topele);
            	     sum=(topele+previous);
            	     S.push(sum);
            	     size++;
            	   System.out.println(sum);
            	    
            	 }  
         		}
             }
          sum=0;
          for(int i=1;i<=S.size();i++) {
   			sum=sum+S.peek(i);
   			System.out.println("final sum -"+sum);
          }
          System.out.println(sum);
}
/*
 * public static void main(String[] args) { stack S=new stack();
 * 
 * S.push(10); S.push(20); S.push(30); // System.out.println(S);
 * System.out.println(S.pop()); System.out.println(S.peek());
 * System.out.println(S.size());
 * 
 * 
 * System.out.print(false) }
 */
}

class stack {
	private int size = 50;
	private Integer stack[] = new Integer[size];
	private int top = 0;

	public boolean push(Integer Element) {
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
