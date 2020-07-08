
public class LinkedListReverse {
	ListNode head;
	
	
	static public class ListNode {
		      int val;
		      ListNode next;
		      
		      ListNode(){}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }

	
	static public void printLinkedList(ListNode l1) {
		while(l1 != null) {
			System.out.println(l1.val);
			l1 = l1.next;
		}
	}
	
		
	static public ListNode reverseList(ListNode head) {
	        
	        ListNode l1 = new ListNode();
	        ListNode l2 = new ListNode();
	        ListNode l3 = new ListNode();
	        
	        l1 = head;
	        l2 = null;
	        l3 = null;
	        
	        while(l1 != null){
	            l2 = l1.next;
	            l1.next = l3;
	            l3 = l1;
	            l1 = l2;
	         
	        }
	           
	        
	        return l3;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListReverse l1 = new LinkedListReverse();
		l1.head = new ListNode(1);
		ListNode second = new ListNode(2);
		l1.head.next = second;
		ListNode third = new ListNode(3);
		second.next = third;
		ListNode forth = new ListNode(4);
		third.next = forth;
		
		printLinkedList(l1.head);
		ListNode newHead = reverseList(l1.head);
		System.out.println();
		printLinkedList(newHead);
		
	}

}
