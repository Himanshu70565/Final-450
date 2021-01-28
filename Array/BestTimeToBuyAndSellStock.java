
public class BestTimeToBuyAndSellStock {
	 
	public int maxProfit(int[] prices) {
	
		int n=prices.length;
		int max_profit=0;
		int maximum[]=new int[n];
		
		maximum[n-1]=prices[n-1];
		for(int i=n-2;i>=0;i--) {
			maximum[i]=Math.max(prices[i], maximum[i+1]);
		}
		
		for(int i=0;i<n;i++) {
			max_profit=Math.max(max_profit, maximum[i]-prices[i]);
		}
		
		return max_profit;
	}
}
