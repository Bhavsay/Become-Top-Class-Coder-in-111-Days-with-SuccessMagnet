class Solution {
    TreeNode pr = null;
    int min = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) return 0;
        inOrder(root);
        return min;
    }

    private void inOrder(TreeNode root) {
        if (root == null) return;

        
        inOrder(root.left);

    
        if (pr != null) {
            min = Math.min(min, Math.abs(pr.val - root.val));
        }
        pr = root;

    
        inOrder(root.right);
    }
}