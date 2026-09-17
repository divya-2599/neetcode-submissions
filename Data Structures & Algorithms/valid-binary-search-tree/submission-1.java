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
    public boolean isValidBST(TreeNode root) {
        if(root==null)
        return true;
        return isValidBST(root.left, Integer.MIN_VALUE, root.val) &&
        isValidBST(root.right, root.val, Integer.MAX_VALUE); 
    }

    public boolean isValidBST(TreeNode root, int min, int max) {
        if(root==null)
        return true;
        if(root.val<=min || root.val>=max)
        return false;
        boolean left = isValidBST(root.left, min, root.val);
        boolean right = isValidBST(root.right, root.val, max);
        return (root.val>min && root.val<max) && left && right;
    }
}
