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
    
    public static boolean search(TreeNode root, int k, HashSet a){
        if(root == null){
            return false;
        }
        
        if(a.contains(k - root.val)){
            return true;
        } else {
            a.add(root.val);
            return search(root.left, k, a)||search(root.right, k, a);
        }
    }
    
    public boolean findTarget(TreeNode root, int k) {
        
        HashSet<Integer> set = new HashSet<Integer>();
        return search(root, k, set);        
    }
}