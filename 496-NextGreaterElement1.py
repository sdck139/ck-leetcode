class Solution(object):
    def nextGreaterElement(self, findNums, nums):
        """
        :type findNums: List[int]
        :type nums: List[int]
        :rtype: List[int]
        """
        map, stack = {}, []
        for num in nums:
            while len(stack) != 0 and stack[-1] < num:
                map[stack.pop()] = num
            stack.append(num)
        for i in range(len(findNums)):
            findNums[i] = map.get(findNums[i], -1)
        return findNums
