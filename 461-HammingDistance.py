class Solution(object):
    def hammingDistance(self, x, y):
        """
        :type x: int
        :type y: int
        :rtype: int
        """
        result = 0
        xor = x ^ y
        while xor > 0:
            result += xor % 2
            xor /= 2
        return result
            
