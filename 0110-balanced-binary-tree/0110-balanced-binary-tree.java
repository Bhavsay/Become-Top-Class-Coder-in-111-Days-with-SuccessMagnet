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
    public boolean isBalanced(TreeNode root) {
        int res = heightcheck(root);
        return res==-1 ? false : true;
    }
    int heightcheck(TreeNode root){
        if(root==null) return 0;

        int left = heightcheck(root.left);
        int right = heightcheck(root.right);

        if(left==-1 || right==-1) return -1;

        if(Math.abs(left-right)>1) return -1;

        return 1 + Math.max(left, right);

    }
}