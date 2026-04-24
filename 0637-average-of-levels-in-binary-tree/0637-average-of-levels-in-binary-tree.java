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
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> result = new ArrayList<>();
        if(root == null) return null;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();

            double averageLevel = 0;
            for(int i=0; i<levelSize; i++){
                TreeNode currentEle = queue.poll();
                averageLevel += currentEle.val;
                if(currentEle.left != null){
                    queue.offer(currentEle.left);
                }
                if(currentEle.right != null){
                    queue.offer(currentEle.right);
                }
                
            }
            averageLevel /= levelSize;
            result.add(averageLevel);            
        }
        return result;
    }
}