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
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode currentNode = q.poll();
            if (currentNode != null) {
                if (set.contains(k - currentNode.val))
                    return true;
                set.add(currentNode.val);
                if (currentNode.left != null)
                    q.offer(currentNode.left);
                if (currentNode.right != null)
                    q.offer(currentNode.right);
            }
        }
        return false;
    }
}