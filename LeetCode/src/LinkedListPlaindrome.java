
import java.util.*;
// Fuck all solution	
public class LinkedListPlaindrome {
	
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		 }
	
	public boolean isPalindrome(ListNode head) {
       	List<Integer> newArray=new ArrayList<>();
	        //insert into arrayList
	        
	        while(head!=null){
	            newArray.add(head.val);
                head=head.next;
	        }
        
        int i=0;
	        int j=newArray.size()-1;
	        
	        while(i<j) {
                System.out.print(i+" "+j);
                    System.out.println();
                    System.out.print(newArray.get(i)+" "+newArray.get(j));
	        		 System.out.println();
                    System.out.print(newArray.get(i).equals(newArray.get(j)));
	        		
	        	if(newArray.get(i).equals(newArray.get(j))) {
                    i++;
	        		j--;
	        	}
	        	else
	        		return false;
	        }
	        
	        
                System.out.print(newArray.size())	 ;    
	        return true;     
        }
    }


/*
  O(n) time & O(1) space
  public boolean isPalindrome(ListNode head) {
 
    if(head==null || head.next==null)
        return true;
     
     //find mid point
     ListNode slow=head;
     ListNode fast=head;
     boolean even=false;
     
     while(fast.next!=null){
         if(fast.next.next == null) {
             even = true;
             break;  
         }
         slow= slow.next;
         fast=fast.next.next;
     }
     
     //reverse first half
     ListNode current=head;
     ListNode next=null;
     ListNode prev=null;
      ListNode mid=slow.next;
     
     while(current!=mid){
         next=current.next;
         current.next=prev;
         prev=current;
         current=next;
     }
     
     if(even==false)
         prev=prev.next;
     
     System.out.print(prev.val);
 
     while(current != null){
         if(current.val!=prev.val)
             return false;
         
             current=current.next;
             prev=prev.next;
     }
     return true;
*/