class Solution(object):
    def findContentChildren(self, g, s):
        """
        :type g: List[int]
        :type s: List[int]
        :rtype: int
        """
        s = sorted(s)
        g = sorted(g)
        count = 0
        start = 0
        for gg in g:
            while start < len(s):
                if s[start] >= gg:
                    count += 1
                    s.pop(start)
                    break
                else:
                    start += 1

        return count
            
