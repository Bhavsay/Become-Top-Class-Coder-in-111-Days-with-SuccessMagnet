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
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        if(root==null){
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

       
        while(!queue.isEmpty()){
            TreeNode currentNode = queue.poll();
            if(currentNode.left!=null){
                TreeNode leftchild = currentNode.left;
                if(leftchild.left==null && leftchild.right==null){
                    sum += leftchild.val;
                }
                else {
                    queue.offer(leftchild);
                }
            }
            if(currentNode.right!=null){
                queue.offer(currentNode.right);
            }
        }
        return sum;


    }
}