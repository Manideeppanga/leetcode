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
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int lh = minDepth(root.left);
        int rh = minDepth(root.right);
        int height = 0;
        if(lh == 0){
           height =  rh + 1;
        }
        else if(rh == 0){
           height = lh + 1;
        }
        else{
            height = Math.min(lh,rh) + 1;
        }
        return height;
    }
}