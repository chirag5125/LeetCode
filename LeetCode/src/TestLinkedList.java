
public class TestLinkedList {
		
	
public static ListNode mergeTwoLists(ListNode headA, ListNode headB) {
    ListNode dummy=new ListNode(0);
    ListNode feet=dummy;
   // System.out.println(l1);
    
   while(true) { 
       
       if(headA==null){
           feet.next=headB;
           break;
       }
       if(headB==null){
           feet.next=headA;
           break;
       }
    if(headA.val<=headB.val) {
    	feet.next=headA;
    	headA=headA.next;
    }
    else {
    	feet.next=headB;
    	headB=headB.next;
    }
   
    feet=feet.next;
    
   }
    return dummy.next; 
}
	public static void main(String args[]) {
		TestLinkedList l=new TestLinkedList();
		ListNode n=new ListNode(1);
		ListNode n1=new ListNode(2);
		ListNode n2=new ListNode(4);
		n.next=n1;
		n1.next=n2;
		
		TestLinkedList l1=new TestLinkedList();
		ListNode q=new ListNode(1);
		ListNode q1=new ListNode(3);
		ListNode q2=new ListNode(4);
		q.next=n1;
		q1.next=n2;
		
		ListNode r= mergeTwoLists(n, q);
	}

}
 class ListNode {
    int val;
    ListNode next;
    public ListNode(int x) { val = x; }
}