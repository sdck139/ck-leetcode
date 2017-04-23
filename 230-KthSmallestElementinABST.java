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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> l = new ArrayList<Integer>();
        ks(root, l);
        return l.get(k-1);
    }
    public void ks(TreeNode root, List l) {
        if(root.left != null) {
            ks(root.left, l);
        }
        l.add(root.val);
        if(root.right != null) {
            ks(root.right, l);
        }
    }
}
