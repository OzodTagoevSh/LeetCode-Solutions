class Solution {
    public int maxProfit(int[] prices) {
        int len=prices.length, profit=0;
        if(len>1) {
            int start=prices[0], end=prices[1];
            for(int i=0; i<len-1; i++) {
                int dif=end-start;
                if(dif>0) {
                    if(dif>profit) profit=dif;
                }
                else start = prices[i];
                end = prices[i+1];
            }
            if(end-start>0) {
                if(end-start>profit) profit=end-start;
            }          
        }
        return profit; 
    }
}