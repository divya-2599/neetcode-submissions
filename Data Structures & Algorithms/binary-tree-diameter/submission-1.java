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
    public int height(TreeNode root) {
        if(root==null)
        return 0;
        int left = 1+ height(root.left);
        int right = 1+height(root.right);
        if(left>right)
        return left;
        return right;
    }
    public int diameterOfBinaryTree(TreeNode root) {
      if (root == null)
        return 0;

    int ld = height(root.left);
    int rd = height(root.right);

    int current = ld + rd;

    int leftDiameter = diameterOfBinaryTree(root.left);
    int rightDiameter = diameterOfBinaryTree(root.right);

    return Math.max(current, Math.max(leftDiameter, rightDiameter));
    }
}
