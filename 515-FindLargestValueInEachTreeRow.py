# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def largestValues(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        self.rowMaxs = []
        self.searchMax(root, 1)
        return self.rowMaxs

    def searchMax(self, root, row):
        if root == None:
            return
        if len(self.rowMaxs) < row:
            self.rowMaxs.append(root.val)
        elif self.rowMaxs[row - 1] < root.val:
            self.rowMaxs[row - 1] = root.val
        self.searchMax(root.left, row + 1)
        self.searchMax(root.right, row + 1)
