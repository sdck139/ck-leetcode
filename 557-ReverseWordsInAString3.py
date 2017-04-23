class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        strs = s.split()
        for i in range(len(strs)):
            strs[i] = strs[i][::-1]
        return " ".join(strs)
        
