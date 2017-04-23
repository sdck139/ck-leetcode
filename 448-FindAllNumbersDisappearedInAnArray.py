class Solution(object):
    def findDisappearedNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        result = []
        for num in nums:
            if nums[num-1] > 0:
                nums[num-1] = nums[num - 1] - len(nums)
        for i in range(len(nums)):
            if nums[i] > 0:
                result.append(i+1)
        return result
