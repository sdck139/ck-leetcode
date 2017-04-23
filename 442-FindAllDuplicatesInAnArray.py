class Solution(object):
    def findDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        nums = sorted(nums)
        result = []
        for i in range(len(nums)):
            if i != len(nums) - 1 and nums[i] == nums[i + 1]:
                result.append(nums[i])
                i += 1
        return result
