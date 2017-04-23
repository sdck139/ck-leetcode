from collections import Counter
class Solution(object):
    def firstUniqChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        temp = s
        while len(temp) > 0:
            c = temp[0]
            temp = temp[1:]
            if temp.find(c) == -1:
                return s.index(c)
            else:
                temp = temp.replace(c, "")
        return -1
