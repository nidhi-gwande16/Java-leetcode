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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1)
        {
            TreeNode node=new TreeNode(val);
            node.left=root;
            return node;
        }
        ArrayDeque<TreeNode> queue=new ArrayDeque<>();
        queue.add(root);
        
        while(queue.size()>0)
        {
            depth--;
            int size=queue.size();
            
            for(int i=1;i<=size;i++)
            {
                TreeNode temp=queue.poll();
                
                if(depth!=1)
                {
                    if(temp.left!=null)
                        queue.add(temp.left);
                    if(temp.right!=null)
                        queue.add(temp.right);
                }
                if(depth==1)
                {
                    TreeNode left=temp.left;
                    TreeNode right=temp.right;
                    
                    temp.left=new TreeNode(val);
                    temp.right=new TreeNode(val);
                    
                    temp.left.left=left;
                    temp.right.right=right;
                }
            }
            if(depth==1)
                break;
        }
        return root;
    }
}