public class BuyandSellStock {

    public static int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int maxP = 0;
        int profit = 0;
      
        while(r < prices.length) {    
            /* as long as the right pointer is less than the length of the array
            check if the price at index 0 which is the most left is less than the price at right if true calculat ethe profit
            */0
            if(prices[l] < prices[r]) {
               
                profit = prices[r] - prices[l];
                maxP = Math.max(maxP, profit);
                
           } else {
                l = r;
            }
            
            // then increment right so we move 1 up and re-iterate
             r++;
        }
        return maxP;
    }
    
}
