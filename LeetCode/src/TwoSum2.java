
public class TwoSum2 {
	 public int[] twoSum(int[] numbers, int target){
	     // Hashtable<Integer, Integer> store=new Hashtable<>();
	       int i=0;
	        int j=numbers.length-1;
	        
	        while(i<j){
	            if(numbers[i]+numbers[j]==target)
	                return new int[]{i+1,j+1};
	            else if(numbers[i]+numbers[j]<target)
	                 i++;
	            else
	                j--;
	            
	            
	        }
	            return new int[]{i+1,j+1};
	        }
	    
}


/*public int[] twoSum(int[] numbers, int target) {
        int[] result=new int[2];
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                int sum=numbers[i]+numbers[j];
                if(sum==target){
                    result[0]=i+1;
                    result[1]=j+1;               
                }
            }
        }
        return result;
    }*/
