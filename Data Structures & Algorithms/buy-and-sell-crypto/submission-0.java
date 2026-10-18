class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        
        int maxProf = 0;
        for(int right = 0;right<prices.length;right++){
            int profit = prices[right]-prices[left];
            if(prices[right]<prices[left]){
                left = right;
            }
            else{
                maxProf = Math.max(maxProf,profit);
            }
        }
        return maxProf;
    }
}
