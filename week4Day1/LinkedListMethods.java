package week4Day1;

import week4Day1.linkedList.Node;

public class LinkedListMethods {
    public static void main(String[] args) throws Exception {
    	LinkedList linkedlist=new LinkedList();
    	for(int each:new int[] {1,2,3,4}) {
    	linkedlist.add(each);
    	}
    	System.out.print(linkedlist);
    	Node lout=new Node(get(2));
    	//System.out.println(printList());
    	//linkedlist.printList();
    }
	}	

class LinkedList{
	class Node{
		int data;
		Node next=null;
	}
	
	Node start=null;
	
	void add(int data) {
		Node node=new Node();
		node.data = data;
		if(start==null) {
			start=node;
		}
		else {
			Node current=start;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=node;
		}
	}
	
	int get(int index) throws Exception {
		Node node=new Node();
		Node current;
		int ind=-1;
		if(start==null) {
			throw new Exception("Element not present in list");
		}
		else {
		    current=start;
		while(current.next!=null) {
			ind++;
			if(ind==index) {
				return current.data;
			}
			current=current.next;
		}
           if(current.next==null && ++ind==index) {
			return current.data;
		}
		}
         return ind;
	}
	
	 void printList()
     {
         Node current = start;
         while (current != null) {
             System.out.print(current.data + " ");
              current = current.next;
         }
         System.out.println();
     }
	
	

	@Override
	public String toString() {
		StringBuffer sb=new StringBuffer();
		sb.append("[");
		Node current = start;
		while(current!=null) {
			sb.append(current.data+",");
			current=current.next;
		}
		sb.append("]");
		return sb.toString();
		
	}
	
	
}
