package week4Day1;

public class MergeTwoSortedList {
       
          public static void main (String[] args) {
        	  LinkedList ll1=new LinkedList();
        	  LinkedList ll2=new LinkedList();
        	  ll1.new Node(1);
        	  ll1.new Node(2);
        	  ll1.new Node(4);
        	  ll2.new Node(1);
        	  ll2.new Node(3);
        	  ll2.new Node(4);
        	  System.out.println(ll1);
        	  System.out.println(ll2);
        	  mergeSort(ll1, ll2);
        	  
          }

		private static void mergeSort(LinkedList ll1, LinkedList ll2) {
      	  LinkedList out=new LinkedList();
      	    while(ll1!=null && ll2!=null) {
      	    	if(ll1.val)
      	    }
			
		}
}

class LinkedList{
	class Node{
		Node next=null;
		int data;
		
		Node(int data){
			this.data=data;
			next=null;
		}
		Node() {
			this.next = null;
			
		}
		
	}
	Node start =null;
	int size =0;
	
	/*
	 * void add(String data) { Node node=new Node(); this.data=data; if(start==null)
	 * { start=node; } else { Node current=start; while(current.next!=null) {
	 * current=current.next; } current.next = node; } size++; }
	 */
	
	@Override
	  public String toString () {
	    StringBuffer sb = new StringBuffer();
	    sb.append("[");
	    Node current = start;
	    while (current != null) {
	      sb.append(current.data + ", ");
	      current = current.next;
	    }
	    sb.append("] --> " + size);
	    return sb.toString();
	  }
}
