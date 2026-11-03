class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int max=0;
        for(int i=0;i<prices.length;i++){
            int cost=prices[i]-min;
            min=Math.min(min,prices[i]);
            max=Math.max(max,cost);
        }
        return max;
    }
}
