
public class RotateArray {
public void rotate(int[] nums, int k) {
        
        for(int count=0;count<k;count++){
            
        int temp=nums[nums.length-1];
        for(int i=nums.length-1;i>0;i--){
            nums[i]=nums[i-1];
        }
        nums[0]=temp;
        }
        
        
    }
}
