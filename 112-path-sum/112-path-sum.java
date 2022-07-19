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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if(root == null){
            return false;
        }
        
        if(root.left == null && root.right == null && root.val == targetSum){
            return true;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val); 
        
        
//         Queue<TreeNode> nodes = new LinkedList<>();
//         nodes.add(root);
//         while(!nodes.isEmpty()) {
//             TreeNode curr = nodes.poll();
//             if(curr.left == null && curr.right == null){
//                 if(targetSum == curr.val){
//                     return true;
//                 }
//             }
            
//             if(curr.left != null) {
//                 curr.left.val = curr.left.val + curr.val;
//                 nodes.add(curr.left);
//             }
//             if(curr.right != null) {
//                 curr.right.val = curr.right.val + curr.val;
//                 nodes.add(curr.right);
//             }
//         }
//         return false;
    }
}