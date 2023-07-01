package mandatoryHomeWork.week4.day3;

public class LinkedList {
	Node head=null;
	Node tail = null;
	int size=0;
	
	class Node{
		int val;
		Node next;
		
		Node(int val){
			this.val=val;
		}
		
		Node(int val, Node node){
			this.val=val;
			this.next=node;
			
		}
	}
	
	public int removeFirstElement() {
		if(head==null) {
			return -1;
		}
		
		int remVal=head.val;
		head=head.next;
		size--;
		return remVal;
	}
	
	public int removeLastelement() {
		
				if(tail==null) {
					return -1;
				}
				
			int remVal=tail.val;
		
			Node temp=head;
			while(temp.next!=tail) {
				temp=temp.next;
			}
			temp.next=null;
			tail=temp;
			size--;
			return remVal;
	}
}
