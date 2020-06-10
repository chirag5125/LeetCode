
public class Maximum_subarray {
	
		public void sub_array(int[] arr) {
		int start = 0;
		int end = 0;
		int sum=0;
		int max_sum = Integer.MIN_VALUE;
		
		for(int i =0; i < arr.length; i++) {
			for(int j = i; j<arr.length; j++) {
				sum = sum+ arr[j];
				if(sum > max_sum) {
					max_sum = sum;
					start = i;
					end = j;
				}
			}
			sum = 0;
		}
		System.out.println("max sum = "+max_sum+" start: "+start+" end: "+end);
		for(int i = start; i<=end;i++)
			System.out.print(arr[i]+" ");
	}
	
		
		public void kadane(int[] arr) {
			
			int max_sum = arr[0];
			int cur_sum = max_sum;
			
			for(int i = 1; i<arr.length;i++) {
				System.out.println("cur_sum+arr[i]: "+(cur_sum+arr[i])+" arr[i]: "+arr[i]);
				cur_sum  = Math.max(cur_sum+arr[i], arr[i]);
				System.out.print("cur_sum: "+cur_sum+" ");
				max_sum = Math.max(cur_sum, max_sum);
				System.out.println(" max_sum: "+max_sum);
			}
			
			System.out.println(max_sum);
		}
		
	
	public static void main(String args[])
	{
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		Maximum_subarray m = new Maximum_subarray();
		//m.sub_array(arr);
		System.out.println();
		m.kadane(arr);
	}

}
