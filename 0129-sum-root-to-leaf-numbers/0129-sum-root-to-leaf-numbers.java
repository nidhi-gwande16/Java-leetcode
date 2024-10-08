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
    int sum=0;
    public void rootSum(TreeNode node,int num){
        num=num*10 + node.val;
        
        if(node.left==null && node.right==null)
        {
            sum+=num;
            return;
        }
        
        if(node.left!=null)
            rootSum(node.left,num);
        
        if(node.right!=null)
            rootSum(node.right,num);
        
    }
    public int sumNumbers(TreeNode root) {
        rootSum(root,0);
        
        return sum;
    }
}