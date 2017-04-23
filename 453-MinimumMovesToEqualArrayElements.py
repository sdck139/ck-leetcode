class Solution(object):
    def minMoves(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        Min = min(nums)
        count = 0
        for num in nums:
            count += num - Min
        return count
