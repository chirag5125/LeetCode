import java.util.HashMap;

public class TwoSum {

	    public int[] twoSum(int[] nums, int target) {
	    HashMap<Integer, Integer> numsMap=new HashMap();
	        
	        for(int i=0; i<nums.length;i++){
	            int remain=target-nums[i];
	            if(numsMap.get(remain)!=null)
	            {
	                return new int[]{numsMap.get(remain), i};
	            }
	            numsMap.put(nums[i],i);
	        
	        } return new int[0];
	       
	    }
}


	/*  int[] a=new int[2];
	        for(int i=0; i<nums.length;i++){
	            for(int j=0; j<nums.length;j++){
	                int sum=nums[i]+nums[j];
	                if(sum==target){
	                    a[0]=j;
	                    a[1]=i;
	                }
	            }
	        }
	         return a;*/


