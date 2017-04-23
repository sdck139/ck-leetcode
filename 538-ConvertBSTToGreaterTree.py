# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def convertBST(self, root):
        """
        :type root: TreeNode
        :rtype: TreeNode
        """
        self.num = 0
        self.search(root)
        return root

    def search(self, root):
        if root == None:
            return
        self.search(root.right)
        root.val += self.num
        self.num = root.val
        self.search(root.left)
        
