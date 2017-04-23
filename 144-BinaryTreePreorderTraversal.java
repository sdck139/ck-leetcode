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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<Integer>();
        if(root == null) return l;
        preorder(root, l);
        return l;
    }
    public static void preorder(TreeNode root, List l) {
        l.add(root.val);
        if(root.left != null) preorder(root.left, l);
        if(root.right != null) preorder(root.right, l);
    }
}
