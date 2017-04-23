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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        Stack<Integer> s = new Stack<Integer>();
        TreeNode[] tl = new TreeNode[nums.length];
        int left = -1;
        int right = nums.length;
        boolean isLeft = true;
        TreeNode head = new TreeNode(nums[(left + right) / 2]);
        tl[(left + right) / 2] = head;
        s.push(right);
        right = (left + right) / 2;
        while(left != nums.length - 1) {
            int mid = (left + right) / 2;
            if(mid == left || (left == -1 && right == 0)) {
                left = right;
                right = s.pop();
                isLeft = false;
            } else {
                tl[mid] = new TreeNode(nums[mid]);
                if(isLeft) {
                    TreeNode temp = tl[right];
                    temp.left = tl[mid];
                } else {
                    TreeNode temp = tl[left];
                    temp.right = tl[mid];
                }
                isLeft = true;
                s.push(right);
                right = mid;

            }
        }
        return head;
    }
}
