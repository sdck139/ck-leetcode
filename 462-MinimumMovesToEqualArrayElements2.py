class Solution(object):
    def minMoves2(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count = 0
        mid = 0
        for n in range(len(sorted(nums))):
            count += 1
            if n == len(nums) / 2:
                mid = sorted(nums)[n]
                break
        move = 0
        for n in nums:
            move += abs(n - mid)
        return move
            
