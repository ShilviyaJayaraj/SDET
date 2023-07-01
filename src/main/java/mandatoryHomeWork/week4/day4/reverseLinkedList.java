package mandatoryHomeWork.week4.day4;

import org.junit.Test;

public class reverseLinkedList {
	public class ListNode {
		int val;
		ListNode next;
		ListNode() {
		}
		ListNode(int val) {
			this.val = val;
		}
		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	@Test
	public void data() {
		ListNode list1 = addNode(1);
		list1.next = addNode(2);
		list1.next.next = addNode(6);
		list1.next.next.next = addNode(3);
		list1.next.next.next.next = addNode(4);
		list1.next.next.next.next.next = addNode(5);
		list1.next.next.next.next.next.next = addNode(6);
	
		reverseList(list1);
	}

	
	 private ListNode addNode(int i) {
		// TODO Auto-generated method stub
		return null;
	}


	public ListNode reverseList(ListNode head) {
		 	ListNode curr = head;
			ListNode prev =null;
			ListNode next=null;
		while(curr!=null) {
		next = curr.next;
		curr.next = prev;
		prev = curr;
		curr = next;
		}
		while (prev != null) {
			System.out.print(prev.val + " ");
			prev = prev.next;
		}
	return prev;
	 }


}
