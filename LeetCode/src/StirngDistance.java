import java.util.Arrays;

public class StirngDistance {

	
	public int countkDist(String str, int k) {
		
		int res=0;
		int n = str.length();
		
		int cnt[]= new int[26];
		
		for(int i= 0; i <n;i++) 
		{
			int dist_count =0;
			
			Arrays.fill(cnt, 0);
			
			for(int j = i;j<n ;j++) {
				//System.out.println(str.charAt(j)+" "+(str.charAt(j)-'a'));
				if(cnt[str.charAt(j) - 'a']==0) {
					dist_count++;
					System.out.println(dist_count+" "+str.charAt(j));
				}
				cnt[str.charAt(j)-'a']++;
				
				if(dist_count==k)
					res++;
				System.out.println("hi "+res+" hi");
			}
			System.out.println();
		}
		
		return res;
	}
	
	
	
	public static void main(String args[]) {
		String s="chirag";
		StirngDistance s1=new StirngDistance();
		int i=s1.countkDist(s, 2);
		System.out.println(i);
	}
}
