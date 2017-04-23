# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
import sys

class Solution(object):
    def getMinimumDifference(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        self.dif = sys.maxint
        self.last = sys.maxint
        self.search(root)
        return self.dif

    def search(self, root):
        if root == None:
            return
        self.search(root.left)
        if abs(self.last - root.val) < self.dif:
            self.dif = abs(self.last - root.val)
        self.last = root.val
        self.search(root.right)
