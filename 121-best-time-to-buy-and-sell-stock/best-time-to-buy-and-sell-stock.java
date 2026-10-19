class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int n = prices.length;
        int[] prefix = new int[n];
        prefix[0] = prices[0];
        for(int i = 1;i < n;i++){
            prefix[i] = Math.min(prefix[i - 1],prices[i]);
        }
        for(int i = 0;i < n;i++){
            int temp = Math.max(prices[i] - prefix[i],0);
            ans = Math.max(ans,temp);
        }
        return ans;
    }
}