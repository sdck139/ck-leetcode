class Solution(object):
    def countArrangement(self, N):
        """
        :type N: int
        :rtype: int
        """
        self.count = 0
        use = [0 for i in range(N + 1)]
        def helper(N, pos, used):
            if pos > N:
                self.count += 1
            for i in range(1, N + 1):
                if used[i] == 0 and (i % pos == 0 or pos % i == 0):
                    used[i] = 1
                    helper(N, pos + 1, used)
                    used[i] = 0
        helper(N, 1, use)
        return self.count
