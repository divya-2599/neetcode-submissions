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
    int current = Integer.MIN_VALUE;
    public int height(TreeNode root) {
        if(root==null)
        return 0;
        int left = height(root.left);
        int right = height(root.right);
        current=Math.max(current, left+right);
        return 1+Math.max(left, right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
      if (root == null)
        return 0;
    int ld = height(root.left);
    int rd = height(root.right);

    return Math.max(current, ld+rd);

    }
}
