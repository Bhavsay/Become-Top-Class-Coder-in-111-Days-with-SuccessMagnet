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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean leftToRight = true;

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            LinkedList<Integer> level = new LinkedList<>();
         
            for(int i=0; i<levelSize; i++){
                TreeNode currentNode = queue.poll();
                
                if(leftToRight){
                    level.addLast(currentNode.val);
                }
                else {
                    level.addFirst(currentNode.val);
                }
                if(currentNode.left != null ){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null ){
                    queue.offer(currentNode.right);
                }
            }
            result.add(new ArrayList<>(level));
            leftToRight = !leftToRight;
        }
        return result;
        
    }
}