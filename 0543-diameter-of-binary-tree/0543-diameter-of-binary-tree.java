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
    int max;
    public int diameterOfBinaryTree(TreeNode root) {
        max = 0;
        dfs(root);
        return max-1;
    }
    
    public int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        
        int left = dfs(root.left);
        int right = dfs(root.right);
        
        max = Math.max(max,1+left+right);
        
        return 1 + Math.max(left,right);
    }
}