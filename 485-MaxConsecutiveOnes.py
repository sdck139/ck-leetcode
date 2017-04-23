class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        temp = 0
        result = 0
        for e in nums:
            if e == 1:
                temp += 1
            else:
                if temp > result:
                    result = temp
                temp = 0
        if temp > result:
            result = temp
        return result
