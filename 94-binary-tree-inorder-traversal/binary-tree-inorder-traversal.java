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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        return inOrderH(root,ans);
    }
    public List<Integer> inOrderH(TreeNode root,List<Integer> a){
        if(root == null) return a;
        inOrderH(root.left,a);
        a.add(root.val);
        inOrderH(root.right,a);
        return a;
    }
}