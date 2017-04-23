class Solution(object):
    def findRelativeRanks(self, nums):
        """
        :type nums: List[int]
        :rtype: List[str]
        """
        length = len(nums)
        if length > 0:
            sortNums = sorted(nums)
            nums[nums.index(sortNums.pop())] = "Gold Medal"
        if length > 1:
            nums[nums.index(sortNums.pop())] = "Silver Medal"
        if length > 2:
            nums[nums.index(sortNums.pop())] = "Bronze Medal"
        count = 4
        while len(sortNums) > 0:
            nums[nums.index(sortNums.pop())] = str(count)
            count += 1
        return nums
