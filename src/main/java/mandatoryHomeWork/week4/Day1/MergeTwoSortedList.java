package  mandatoryHomeWork.week4.Day1;

import mandatoryHomeWork.week4.Day1.linkedList;
import mandatoryHomeWork.week4.Day1.linkedList.Node;

public class MergeTwoSortedList{
    public static void main (String[] args) {
    	linkedList ll1=new linkedList();
    	linkedList ll2=new linkedList();
    		ll1.add(1);
    		ll1.add(2);
    		ll1.add(3);
    		ll2.add(1);
    		ll2.add(3);
    		ll2.add(4);
    	System.out.println(ll1);
    	System.out.println(ll2);
    	ll1.start=new linkedList().mergeSort(ll1.start, ll2.start);
    	ll1.printList();
    }
}

class linkedList{
class Node {
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
     void printList()
     {
         Node current = start;
         while (current != null) {
             System.out.print(current.data + " ");
              current = current.next;
         }
         System.out.println();
     }
     
     Node mergeSort(Node ll1, Node ll2) {
    	 Node merge=new Node();
    	 Node tail=merge;
    	 while(true) {
    	 if(ll1==null) {
    		 tail.next=ll2;
    		 break;
    	 }
    	 if(ll2==null) {
    		 tail.next=ll1;
    		 break;
    	 }
          if(ll1.data<=ll2.data) {
        	  tail.next=ll1;
              ll1=ll1.next;
          }
          else {
        	  tail.next=ll2;
        	  ll2=ll2.next;
          }
          tail=tail.next;
         }
       return merge.next;
     }   
     
     @Override
     public String toString() {
     	StringBuffer sb=new StringBuffer();
     	sb.append("[");
     	Node current=start;
     	while(current!=null) {
     		sb.append(current.data+",");
     		current = current.next;
     	}
     	sb.append("]");
     	return sb.toString();
     }

}
