class Solution(object):
    def combinationSum3(self, k, n):
        """
        :type k: int
        :type n: int
        :rtype: List[List[int]]
        """
        result = []
        def combine(comb, k, start, n):
            if len(comb) == k:
                if n == 0:
                    result.append(comb)
                return
            for i in range(start, 10):
                comb.append(i)
                combine(list(comb), k, i + 1, n - i)
                comb.pop()
        combine([], k, 1, n)
        return result


                   
