package week6.Day1;


public class SwapNodeInPairs {

	public static void main(String[] args) {
         LinkedList l=new LinkedList();
         Node start=null;
         start=l.add(1, start);  
         start=l.add(2, start);
         start=l.add(3, start);  
         start=l.add(4, start);
         l.print(start);
         l.swap(start);
         System.out.println();
         l.printSwapfirstNode(start);
	}
	
}

 class Node{
	int data;
	Node next=null;
}

class LinkedList{

	private Node getNewNode(int data) {
		Node n=new Node();
		n.data=data;
		n.next=null;
	    return n;
	}
	
	public Node swap(Node start) {
		Node dummy=new Node();
		    dummy.next=start;
		    Node point=dummy;
	while(point.next!=null && point.next.next!=null) {    // 1 -> 2 -> 3 -> 4
		Node swap1=point.next;
		Node swap2=point.next.next;
		
		swap1.next=swap2.next;
		swap2.next=swap1;
		point.next=swap2;
		point=swap1;
	}
	return dummy.next;
	}

	public Node add(int data, Node node) {
		
		if(node==null) {
			return getNewNode(data);
		}
		else {
			node.next=add(data, node.next);
		}
		
		return node;
	}
	
	
	public void print(Node node) {
		if(node==null) {
			return;
		}
		System.out.print(node.data+ ", ");
		print(node.next);
	}
	
	public void printSwapfirstNode(Node node) {
		/*
		 * if(node!=null) { Node current=node.next; System.out.print(current.data +
		 * ", "); return; }
		 */
		/*
		 * Node dummy=new Node(); dummy.next=node;
		 * 
		 * return dummy.next;
		 */
		System.out.print(node.data +", ");
		return;
	}


	
	
}
