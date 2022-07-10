import java.lang.Math;
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0;
        int minPrice = prices[0];
        for(int i = 1; i<n; i++){
            max = Math.max(max, prices[i]-minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return max;
    }
}