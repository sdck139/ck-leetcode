# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def sumOfLeftLeaves(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if root == None:
            return 0
        if root.left == None and root.right == None:
            return 0
        self.nums = []
        def search(root, key):
            if root == None:
                return
            if root.left == None and root.right == None and key == 0:
                self.nums.append(root.val)
            search(root.left, 0)
            search(root.right, 1)
        search(root.left, 0)
        search(root.right, 1)
        return sum(self.nums)
