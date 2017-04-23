public class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int[] transactions = new int[prices.length];
        int[] p = new int[prices.length];
        for(int i = 0; i < prices.length; i++) {
            transactions[i] = 0;
        }
        for(int i = 0; i < prices.length; i++) {
            p[i] = 0;
            // transactions[i] = 0;
            for(int j = i - 1; j >= 0; j--) {
                if(transactions[j] == 0 && prices[j] < prices[i] && (prices[i] - prices[j] + p[j] >= p[i])) {
                    transactions[i] = 1;
                    if(i != prices.length - 1) transactions[i + 1] = 2;
                    p[i] = prices[i] - prices[j] + p[j];
                } else if(transactions[j] == 1) {
                    if(j + 2 < i && prices[j + 2] < prices[i] && (prices[i] - prices[j + 2] + p[j] >= p[i]))  {
                        p[i] = prices[i] - prices[j + 2] + p[j];
                        transactions[i] = 1;
                        if(i != prices.length - 1) transactions[i + 1] = 2;
                    }
                    else if(p[j] > p[i]) p[i] = p[j];
                } else if(transactions[j] == 2 && prices[j] < prices[i] && (prices[i] - prices[j] + p[j - 2] >= p[i])) {
                    transactions[i] = 1;
                    if(i != prices.length - 1) transactions[i + 1] = 2;
                    p[i] = prices[i] - prices[j] + p[j - 2];
                } else if(p[j] > p[i]){
                    p[i] = p[j];
                }
            }
            maxProfit = maxProfit > p[i] ? maxProfit : p[i];
        }
        return maxProfit;
    }
}
