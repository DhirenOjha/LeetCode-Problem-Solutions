class Solution {
    public int maxProfit(int[] prices) {
        int buy,sell,profit;
        int min=Integer.MAX_VALUE;
        int max=0,maxpro=0;
        for(int i=0;i<prices.length;i++)
        {
            min=Math.min(prices[i],min);
            if(prices[i]>min)
                max=prices[i]-min;
            maxpro=Math.max(max,maxpro);
        }
        return maxpro;
    }
}