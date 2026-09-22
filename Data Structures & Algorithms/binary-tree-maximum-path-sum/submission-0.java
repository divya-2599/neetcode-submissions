/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int maxsum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        solve(root);
        return maxsum;
    }

    public int solve(TreeNode root) {
        if(root==null)
        return 0;
        int left = solve(root.left);
        int right = solve(root.right);
        int sum1 = root.val+left+right;
        int sum2 = root.val+Math.max(left, right);
        int sum3 = root.val;
        maxsum = Math.max(maxsum,Math.max(Math.max(sum1, sum2), sum3));
        return Math.max(sum2, sum3);
    }
}
