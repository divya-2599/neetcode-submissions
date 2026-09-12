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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root.val==p.val || root.val==q.val)
        return root;
        TreeNode left = (p.val<root.val || q.val<root.val)?lowestCommonAncestor(root.left, p, q) : null;
        TreeNode right = (p.val>root.val || q.val>root.val) ? lowestCommonAncestor(root.right, p, q) : null;
        if(left!=null && right!=null)
        return root;
        if(left!=null && right==null)
        return left;
        if(left==null && right!=null)
        return right;
        return null;
    }
}
