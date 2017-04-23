class Solution(object):
    def findComplement(self, num):
        """
        :type num: int
        :rtype: int
        """
        if num == 0:
            return 1
        long = 0
        temp = num
        while num > 0:
            num /= 2
            long += 1
        return pow(2, long) - temp -  1
