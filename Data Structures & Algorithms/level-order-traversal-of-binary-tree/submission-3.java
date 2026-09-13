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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root==null)
        return list;
        levelOrderTraversal(root, list, 0);
        return list;
    }
    public void levelOrderTraversal(TreeNode root, List<List<Integer>> list, int depth) {
        if(root==null)
        return;
        if(list.size()==depth){
            list.add(new ArrayList<>());
        }
        levelOrderTraversal(root.left, list, depth+1);
        levelOrderTraversal(root.right, list, depth+1);
        list.get(depth).add(root.val);
    }
}
