class Solution(object):
    def convertToBase7(self, num):
        """
        :type num: int
        :rtype: str
        """
        if num == 0:
            return '0'
        minus = 0
        result = ''
        if num < 0:
            minus = 1
            num = abs(num)
        while num > 0:
            result = str(num % 7) + result
            num /= 7
        if minus == 1:
            result = '-' + result
        return result
            
