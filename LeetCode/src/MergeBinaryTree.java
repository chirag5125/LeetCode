
import java.util.*;

public class MergeBinaryTree {
	
	
	  public class TreeNode {
		  int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; 
	      }
	      
	      public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
	    	    
	    	  
	          if(t1==null)								//if t1 is empty return node t2
	              return t2;
	          if(t2==null)								//if t2 is empty return node t1
	              return t1;
	          
	          t1.val=t1.val+t2.val;
	          t1.left=mergeTrees(t1.left, t2.left);
	          t1.right=mergeTrees(t1.right, t2.right);
	              
	          
	          return t1;
	      }	 }

}
