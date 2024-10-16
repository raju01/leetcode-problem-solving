class Solution {
    public int maxProfit(int[] prices) {
        int minSoFor=prices[0], maxProfit=0;

        for(int i=0;i<prices.length;i++){
           minSoFor= Math.min(minSoFor, prices[i]);
           maxProfit = Math.max(maxProfit, prices[i]-minSoFor); 
        }
       return maxProfit; 
    }
}