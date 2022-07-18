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
    
    public static int leftHeight(TreeNode root){
        int heightL = 0;
        while(root != null){
            heightL++;
            root = root.left;
        }
        return heightL;
    }
    
    public static int rightHeight(TreeNode root){
        int heightR = 0;
        while(root != null){
            heightR++;
            root = root.right;
        }
        return heightR;
    }
    
    public static int totalNodes(TreeNode root){
        
        if(root == null) {
            return 0;
        }
        
        int hL = leftHeight(root);
        int hR = rightHeight(root);
        if(hL == hR){
            return (int)Math.pow(2, hR)-1;
        }
        
        return 1 + totalNodes(root.left) + totalNodes(root.right);
    }
    
    public int countNodes(TreeNode root) {
        
        return totalNodes(root);
        
    }
}