class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        table = {}
        result = 0
        for ss in s:
            if not table.has_key(ss):
                table[ss] = 1
            else:
                table[ss] += 1
        for v in table.values():
            if v % 2 == 0:
                result += v
            else:
                result += (v - 1)
        if result < len(s):
            result += 1
        return result
