
public class MaxProfit {

	public static int maxprofit(int [] prices) {
		if(prices == null && prices.length ==  0) {
			return 0;
		}
		
		int minPrice = prices[0];
		int maxProfit = 0;
		
		for(int i = 0 ; i< prices.length;i++) {
			if(prices[i] < minPrice) {
			
				minPrice = prices[i];
				
			}else {
				int currentProfit = prices[i] - minPrice;
				if(currentProfit > maxProfit) {
					maxProfit = currentProfit; 
				}
			}
		}
		return maxProfit;
	}
	
	public static void main(String[] args) {
		
		int prices [] = {7,1,5,3,6,4};
		int maxProfit = maxprofit(prices);
		
		System.out.println("Maximum Profit " + maxProfit);
		
	}
}
