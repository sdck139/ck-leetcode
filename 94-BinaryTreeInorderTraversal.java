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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<Integer>();
        if(root == null) return l;
        inorder(root, l);
        return l;
    }
    public static void inorder(TreeNode root, List l) {
        if(root.left != null) inorder(root.left, l);
        l.add(root.val);
        if(root.right != null) inorder(root.right, l);
    }
}
