import java.util.*;

public class LowestCommonAncestor {

	
	public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
	
	TreeNode x;
	Hashtable<Integer, TreeNode> parent1=new Hashtable<>();
	Hashtable<Integer, TreeNode> parent2=new Hashtable<>();
	
	Stack<TreeNode> sc=new Stack<TreeNode>();
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
     
		findAncestor1(root, p);
		Stack<TreeNode> sc1=findAncestor2(root, q);
		
		
	return sc1.pop();
    }
	
	public void findAncestor1(TreeNode root, TreeNode p) 
	{
		x=root;
	     
		if(x.val==p.val)
			parent1.put(x.val, x);
			
	     	if(p.val<x.val) {
	     		parent1.put(x.val, x);
	     		findAncestor1(x.left, p);
	     	}
	     	if(p.val>x.val)
	     	{
	     		parent1.put(x.val, x);
	     		findAncestor1(x.right, p);
	     	}
			
	}
	
	public Stack<TreeNode> findAncestor2(TreeNode root, TreeNode p) 
	{
		x=root;
	     
		// Traverse until root reaches to dead end  
	    while (root != null)  
	    {  
	        // pass right subtree as new tree  
	        if (p.val > x.val)  {
	        	parent2.put(x.val, x);
	        	if(parent1.contains(x.val))
	        		sc.push(x);
	        	root = root.right;
	        }
	        // pass left subtree as new tree  
	        else if (p.val < x.val)  {
	        	parent1.put(x.val, x);
	        	if(parent1.contains(x.val))
	        		sc.push(x);
	        	root = root.left;  
	        }
	        else {
	        	parent1.put(x.val, x);
	        	return sc;
	        }
	            // if the key is found return 1  
	    }  
	    return sc;  
			
	}

}
