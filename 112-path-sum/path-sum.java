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
    public static int sum = 0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        sum += root.val;
        if(root.left == null && root.right == null){
            if(sum == targetSum){
                sum -= root.val;
                return true;
            }
        }
       boolean l =  hasPathSum(root.left,targetSum);
       boolean r = hasPathSum(root.right,targetSum);
       if(root != null){
        sum -= root.val;
       }
        if(l || r){
            return true;
        }
        return false;
    }
}