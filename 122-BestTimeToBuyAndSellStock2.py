class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        have = 0
        profit = 0
        min = 2147483647
        max = 0
        for i in range(len(prices)):
            if have == 0:
                if prices[i] <= min:
                    min = prices[i]
                else:
                    have = 1
                    max = prices[i]
                    if i == len(prices) - 1:
                        profit += max - min
            else:
                if prices[i] >= max:
                    max = prices[i]
                    print(i)
                    if i == len(prices) - 1:
                        profit += max - min
                else:
                    have = 0
                    profit += max - min
                    min = prices[i]
        return profit
