
public class MoveZeros {
	
	 public void moveZeroes(int[] nums) {
	        
		 for(int i =0; i<nums.length;i++) {
			 if(nums[i]==0) {
				 for(int j=i;j<nums.length;j++) {
					 if(nums[j]!=0) {
						 int temp=nums[i];
						 nums[i]=nums[j];
						 nums[j]=temp;
						 break;
					 }
				 }
			 }
		 }
		 
		 for(int i=0; i<nums.length;i++) {
			 System.out.print(nums[i]+" ");
		 }
		 
	    }
	 
	 
	 public void moveZeroFaster(int[] nums) {
		 int pos=0;
		 
		 for(int i=0;i<nums.length;i++) {
			 if(nums[i]!=0) {
				 nums[pos]=nums[i];
				 pos++;
			 }
		 }
		 
		 for(;pos<nums.length;pos++) {
			 nums[pos]=0;
		 }
		 
		 for(int i=0; i<nums.length;i++) {
			 System.out.print(nums[i]+" ");
		 }
	 }
	 
	 public static void main(String args[]) {
		 int[] arr = {0,1,0,3,12};
		 
		 MoveZeros m = new MoveZeros();
		 m.moveZeroes(arr);
		 System.out.println();
		 m.moveZeroFaster(arr);
	 }

}
