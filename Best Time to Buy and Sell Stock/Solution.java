class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length == 0)
        {
            return 0;
        }
        int curLowest = prices[0];
        
        int maxProf = 0;
        
        for(int i = 1; i < prices.length; i++)
        {
            if(prices[i] < curLowest)
            {
                curLowest = prices[i];
            }
            else
            {
                maxProf = Math.max(maxProf, prices[i] - curLowest);
            }
        }
        
        return maxProf;
    }
}
