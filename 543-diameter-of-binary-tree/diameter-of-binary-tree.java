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
    static class info{
        int d;
        int h;
        info(int d,int h){
            this.d = d;
            this.h = h;
        }
    }
    public info diameter(TreeNode root){
        if(root == null){
            return new info(0,0);
        }
        info lf = diameter(root.left);
        info rf = diameter(root.right);
        int diam = Math.max(lf.h + rf.h + 1,Math.max(lf.d,rf.d));
        int height = Math.max(lf.h,rf.h) + 1;
        return new info(diam,height);

    }
    public int diameterOfBinaryTree(TreeNode root) {
       int ans = diameter(root).d;
       return ans - 1;
    }
}