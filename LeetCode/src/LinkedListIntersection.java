//Using O(n) space

import java.util.*;
public class LinkedListIntersection {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //check if they intersect at 0th position
        if(headA==headB){
            return headA;
        }
        
        //check if either of the list is empty
        if(headA==null || headB==null){
            return null;
        }
        else{
        Hashtable<ListNode, Integer> h=new Hashtable<>();
        while(headA!=null){
            h.put(headA, headA.val);
            headA=headA.next;
        }
            System.out.print(h);
        while(headB!=null){
            if(h.containsKey(headB)){
                return headB;
            }
            headB=headB.next;
        }
        return null;
        }
    }
}
