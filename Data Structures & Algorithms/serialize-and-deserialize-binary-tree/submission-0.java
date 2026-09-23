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

public class Codec {
    int i=0;
   
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder str = new StringBuilder();
        serialize(root, str);
        return str.toString();
    }

    public void serialize(TreeNode root, StringBuilder str) {
        if(root==null) {
        str.append("*").append(",");
        return;
        }
        str.append(root.val);
        str.append(",");
        serialize(root.left, str);
        serialize(root.right,str);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(i>=data.length())
        return null;
        int num=0;
        if(data.charAt(i)=='*') {
            i+=2;
        return null;
        }
        while(i<data.length() && Character.isDigit(data.charAt(i))){
            num=num*10+(data.charAt(i)-'0');
           i++;
        }
        i++;
        TreeNode root = new TreeNode(num);
        root.left=deserialize(data);
        root.right=deserialize(data);
        return root;
    }
}
