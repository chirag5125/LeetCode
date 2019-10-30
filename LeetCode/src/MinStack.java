import java.util.*;
class MinStack {
	//Time complexity O(1)
		Stack<Integer> regular;
		Stack<Integer> minStack;
		int min;
		    
		     //initialize your data structure here. 
		    public MinStack() {
		    regular=new Stack<>();
		    minStack=new Stack<>();
		    }
		    
		    public void push(int x) {
		    	//If top of the stack is empty, minimum=new element
		    	regular.push(x);
	            if(minStack.isEmpty()) {
		    		minStack.push(x);
		    	}
		    	else if(x<=minStack.peek()) {
		    		minStack.push(x);
		    	}
	            
		    	
		    }
		     
		    
		    public void pop() {
		    	int a=regular.pop();
	            if(minStack.peek()==a) {
		    		minStack.pop();
		    		//regular.pop();
		    	}
	            
	            System.out.print(regular);
	            System.out.println();
		    	System.out.print(minStack);
	            System.out.println();
		    	
		    }
		    
		    public int top() {
		    	    	
		    	return regular.peek();
		    }
		    
		    public int getMin() {
		    
		    	return minStack.peek();
		    }
	}	

/* Your MinStack object will be instantiated and called as such:
	 * MinStack obj = new MinStack();
	 * obj.push(x);
	 * obj.pop();
	 * int param_3 = obj.top();
	 * int param_4 = obj.getMin();


//Time complexity O(n)
class MinStack {
  List<Integer> list;
  int min;
  
   //initialize your data structure here. 
  public MinStack() {
      list=new LinkedList<Integer>();
  }
  
  public void push(int x) {
      list.add(x);
      if(x<min){
          min=x;
      }
     
  }
  
  public void pop() {
      list.remove(list.size()-1);
  }
  
  public int top() {
      return list.get(list.size()-1);
  }
  
  public int getMin() {
      System.out.print(list);
      int min=list.get(0);
      for(int i=0; i<list.size();i++){
          if(list.get(i)<min)
              min=list.get(i);
      }
      return min;
  }
}
 Your MinStack object will be instantiated and called as such:
* MinStack obj = new MinStack();
* obj.push(x);
* obj.pop();
* int param_3 = obj.top();
* int param_4 = obj.getMin();
*/