class Solution(object):
    def findTheDifference(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: str
        """
        result = 'X'
        ss = sorted(s)
        ts = sorted(t)
        for i in range(len(ss)):
            if ss[i] != ts[i]:
                result = ts[i]
                break
        if result == 'X':
            result = ts[len(ts) - 1]
        return result
