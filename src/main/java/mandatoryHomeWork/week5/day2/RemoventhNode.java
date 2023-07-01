package mandatoryHomeWork.week5.day2;

import mandatoryHomeWork.week4.day4.reverseLinkedList.ListNode;

public class RemoventhNode {
	public int size(ListNode head) {
		ListNode n=head;
		int count=0;
		if(head == null) {
			return 0;
		}
		else {
			ListNode temp=head;
			while(temp.next!=null) {
				count++;
				temp=temp.next;
			}
			count=count+1;
		}
		return count;
	}
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //MyLinkedList ll=new MyLinkedList();
		int nodeSize=size(head);
		int removeIndex=nodeSize-n;
		int count=0;
		ListNode temp1=head;
		ListNode temp2=head.next;
		
		//when removable index is 0
		
		if(removeIndex==0) {
			head=head.next;
			return head;
		}
		
		//regular case
		else {
		while(temp2.next!=null) {
			count++;
			if(count==removeIndex) {
				temp1.next=temp2.next;
				return head;
			}
			
			temp2=temp2.next;
			temp1=temp1.next;
		}
		//when removable index is last one
			count++;
			if(count==removeIndex) {
				temp1.next=null;
				return head;
			}
		}
		
		
		
		return null;
    }
}
