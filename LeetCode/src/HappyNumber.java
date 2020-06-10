import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	
	 public int breakdown(int n){
	        int result =0;
	        int rem=0;
	        while(n>0){
	            
	            rem = n%10;
	            System.out.println(rem+" + "+rem+ " = "+rem*rem );
	            result = result + (rem*rem);
	            n=n/10;
	        }
	        System.out.println(result);
	        
	        return result;
	    }
	    
	    public boolean isHappy(int n) {
	        
	    	Set<Integer> s = new HashSet<Integer>();
	    	
	    	
	        int res = n;
	        boolean ans = false;
	        while(ans != true){
	            res = breakdown(res);
	            
	            if(res == 1)
	            {
	                return true;
	            }
	            else if(s.contains(res)==true)
	            {
	                return false;
	            }
	            else {
	            	s.add(res);
	            }
	        }
	     return ans;   
	    }
	    
	    public static void main(String argsp[]) {
	    	HappyNumber h = new HappyNumber();
	    	System.out.println(h.isHappy(2));
	    }
}
