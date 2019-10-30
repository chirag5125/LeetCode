import java.util.*;
public class BaseBall {
	
	    public int calPoints(String[] ops) {
	        
	        Stack<Integer> s=new Stack<>();
	        if(ops[0]=="C" || ops[0]=="D" || ops[0]=="+")
	            return 0;
	        for(int i=0;i<ops.length;i++){
	            if(ops[i]!="C" || ops[i]!="D" || ops[i]!="+")
	            {
	                s.push(Integer.parseInt(ops[i]));
	            }
	        }
	        return 0;
	    }
}
