
public class StockBuySell {		
	
	public int maxProfit(int[] prices) {
	
		int max_profit=0;
		int buy=Integer.MAX_VALUE;
		int min_loaction=0;
		
		if(prices.length==0) {
			return max_profit;
		}
		else{
			for(int i=0;i<prices.length;i++) {
				if(prices[i]<buy) 
				{
					if(i==prices.length-1)
						return 0;
					buy=prices[i];
					min_loaction=i;
				}
			}
			
			int sell=buy;
			for(int i=min_loaction+1;i<prices.length;i++) {
				if(sell>prices[i]) {
					sell=prices[i];
				}
			}
			
		}
		
		return max_profit;
	}
}


/*int max_profit=0; 
if(prices.length>0) {

 int buy=findMin(prices);
 int sell=findMax(prices, buy);
 
	 max_profit=prices[sell]-prices[buy];
}
 else
	 max_profit=0;
System.out.println();	 
 return max_profit;
}



public int findMin(int[] prices) {
int min_location=0;
int min=prices[0];
for(int i=0;i<prices.length;i++) {
	if(min>prices[i])
	{
		min=prices[i];
		min_location=i;
	}
	//return min_location;
}

return min_location;
}

public int findMax(int[] prices, int start_location) {
int max_location = 0;
int max=prices[start_location];

for(int i=start_location;i<prices.length;i++) {
	if(max<prices[i]) {
		max=prices[i];
		max_location=i;
	}
}


return max_location;
*/