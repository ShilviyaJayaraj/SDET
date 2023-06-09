package mandatoryHomeWork.week4.day1;

import mandatoryHomeWork.week4.day1.linkedList.Node;

public class LinkedListMethods {
    public static void main(String[] args) throws Exception {
    	LinkedList linked=new LinkedList();
    	for(int each:new int[] {1,2,3,4}) {
    	linked.add(each);
    	}
    	System.out.print(linked);
    	linked.get(2);
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
	
	 public int indexOf(int val) {
			int index=-1;
			Node temp;
			if(start==null) {
				return index;
			}
			else {
				temp=start;
				while(temp.next!=null) {
					index++;//1
					if(temp.data==val) {
						return index;
					}
					temp=temp.next;
				}
			}
			if(temp.next==null && temp.data==val) {
				//index++;
				return ++index;
			}
			
			return index;
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
