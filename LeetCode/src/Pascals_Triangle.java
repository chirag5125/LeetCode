import java.util.*;
public class Pascals_Triangle {
	
	public List<Integer> getRow(int rowIndex) {
		 List<Integer> l2 = new ArrayList<Integer>(); 
		int[][] a=new int[33][33];
		for(int i=0;i<33;i++) {
			for(int j=0;j<33;j++) {
				if(i==j || j==0) {
					a[i][j]=1;
                  // System.out.println(i+" "+j);
				}
				else {
					if(i-1<0) {
						continue;
					}
					else{
						a[i][j]=a[i-1][j-1] + a[i-1][j];
                   }
               }
			}
		}
		 
		for(int i=0;i<=rowIndex;i++) {
			int j=rowIndex;
			l2.add(a[j][i]);
		}
		 
		 return l2;
	    }
}
