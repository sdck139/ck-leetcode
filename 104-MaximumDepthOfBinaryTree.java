/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int leftMax = 0, rightMax = 0;
        if(root.left != null) {
            leftMax = maxDepth(root.left);
        }
        if(root.right != null) {
            rightMax = maxDepth(root.right);
        }
        return Math.max(leftMax, rightMax) + 1;
    }
}
