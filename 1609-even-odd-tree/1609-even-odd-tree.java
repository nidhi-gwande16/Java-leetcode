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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int level=0;
        while(queue.size()>0)
        {
            int size=queue.size();
            TreeNode previous=null;
            for(int i=1;i<=size;i++)
            {
                if(i==1)
                {
                    previous=queue.poll();
                    if(previous.left!=null)
                        queue.add(previous.left);
                    if(previous.right!=null)
                        queue.add(previous.right);
                    if(level%2==0 && previous.val%2==0)
                        return false;
                    
                    if(level%2!=0 && previous.val%2!=0)
                        return false;
                    
                    continue;
                }
                TreeNode current=queue.poll();
                if(level%2==0)
                {
                    if(current.val%2==0 || previous.val>=current.val)
                        return false;
                }
                else{
                    if(current.val%2!=0 || previous.val<=current.val)
                        return false;
                }
                
                if(current.left!=null)
                    queue.add(current.left);
                if(current.right!=null)
                    queue.add(current.right);
                
                previous=current;
            }
            level++;
        }
        return true;
    }
}