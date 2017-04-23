# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def findFrequentTreeSum(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        self.sums = dict({})
        self.countMax(root)
        max = 0
        result = []
        for keys in self.sums:
            if self.sums[keys] > max:
                result = [keys]
                max = self.sums[keys]
            elif self.sums[keys] == max:
                result.append(keys)
        return result

    def countMax(self, root):
        if root == None:
            return 0
        left = self.countMax(root.left)
        right = self.countMax(root.right)
        sum = left + right + root.val
        count = self.sums.get(sum, 0) + 1
        self.sums[sum] = count
        return sum
