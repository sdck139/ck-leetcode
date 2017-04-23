class Solution(object):
    def generateParenthesis(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        result = []
        def addMore(item, left, right, n):
            if left == right == n:
                result.append(item)
                return
            if left == n:
                addMore(item + ")", left, right + 1, n)
                return
            if left > right:
                addMore(item + "(", left + 1, right, n)
                addMore(item + ")", left, right + 1, n)
                return
            else:
                addMore(item + "(", left + 1, right, n)
                return
        addMore("", 0, 0, n)
        return result
