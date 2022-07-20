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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        TreeNode newNode = new TreeNode(val);
        
        if(root == null){
            return newNode;
        }
        
        TreeNode tmp = root;
        
        while(true) {
            if(tmp.val < val){
                if(tmp.right != null){
                    tmp = tmp.right;
                } else {
                    tmp.right = newNode;
                    break;
                }
            }
            else {
                if(tmp.left != null) {
                    tmp = tmp.left;
                } else {
                    tmp.left = newNode;
                    break;
                }
            }
        }
        return root;
    }
}