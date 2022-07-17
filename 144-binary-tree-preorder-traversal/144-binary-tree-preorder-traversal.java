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
    
    public void recursion(TreeNode curr, ArrayList<Integer> list){
        if(curr == null){
            return;
        }
        list.add(curr.val);
        recursion(curr.left, list);
        recursion(curr.right, list);
    }
    
    public List<Integer> preorderTraversal(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        recursion(root, list);
        return list;
    }
}