class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        for i in range(len(nums)):
            if target - nums[i] in nums:
                index = len(nums) - nums[-1::-1].index(target - nums[i]) - 1
                if index != i:
                    return [i, index]
