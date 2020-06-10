
public class LongestCommonPrefix {

	    public String longestCommonPrefix(String[] strs) {
	        
	    	if(strs.length==0)
	            return "";
	        else if(strs.length==1)
	            return strs[0];
	        
	    	int smallestStringLoc = 0;
	    	String smallestString= strs[0];
	        int minLength = strs[0].length();
	        
	        
	        for(int i=1; i<strs.length; i++){
	            if(strs[i].length() < minLength){
	                minLength = strs[i].length();
	                smallestString = strs[i];
	                smallestStringLoc=i;
	            }
	        }
	      
	    //System.out.println(smallestString);
	        
	        int count =0;
	        
	        for(int i=0; i<strs.length; i++)
	        {
	        	if(i == smallestStringLoc)
	        		continue;
	        	
	            for(int j=0;j<minLength; j++){
	                if(strs[i].charAt(j) != smallestString.charAt(j))
	                    continue;
	                if(j == strs.length-1)
	                    count++;
	            }
	        }
	       // System.out.println(smallestString.substring(0, count+1));
	       if(count == 0)
	    	   return "";
	       else
	        return smallestString.substring(0,count+1);
	    }
		 

	public static void main(String args[]) {
		String[] str = {"c","c"};
		LongestCommonPrefix l = new LongestCommonPrefix();
		
		System.out.println(l.longestCommonPrefix(str));
	}

}
