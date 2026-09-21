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
    Map<Integer, Integer> map = new HashMap<>(); 
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        int m = inorder.length;
        for(int i=0;i<m;i++) {
            map.put(inorder[i], i);
        }
        return buildTree(preorder, inorder, 0, n-1, 0, m-1);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder, int prestart, int preend, int instart, int inend) {
        if(prestart>preend || instart>inend)
        return null;
          int start=preorder[prestart];
          TreeNode root = new TreeNode(start);
          if(map.containsKey(start)) {
            int index=map.get(start);
            int ele=index-instart;
            root.left = buildTree(preorder, inorder, prestart+1, prestart+ele, instart, index-1);
            root.right=buildTree(preorder, inorder, prestart+ele+1, preend, index+1, inend);   
          }
          return root;
    }
    
}
