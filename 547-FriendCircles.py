class Solution(object):
    def findCircleNum(self, M):
        """
        :type M: List[List[int]]
        :rtype: int
        """
        length = len(M)
        stack = [False for i in range(length)]
        result = 0
        def search(i):
            if stack[i]:
                return
            stack[i] = True
            for j in range(length):
                if M[i][j] == 1:
                    search(j)
        for i in range(length):
            if not stack[i]:
                result += 1
                search(i)
        return result
