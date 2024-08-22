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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q= new ArrayDeque<>();
        q.add(root);
        
        int leftMost=0;
        
        while(q.size()>0)
        {
            leftMost=q.peek().val;
            int size=q.size();
            for(int i=1;i<=size;i++)    
            {
                TreeNode temp=q.poll();
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
                
            }
        }
        return leftMost;
    }
}