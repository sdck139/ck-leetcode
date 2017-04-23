# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def findBottomLeftValue(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        self.result = 0
        self.maxRow = 0
        self.find(root, 0)
        return self.result

    def find(self, root, row):
        if root == None:
            return
        self.find(root.left, row + 1)
        if row + 1 > self.maxRow:
            self.maxRow = row + 1
            self.result = root.val
        self.find(root.right, row + 1)
    
