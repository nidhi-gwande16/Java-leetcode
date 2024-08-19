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
        public void deleteNodes(TreeNode node, TreeNode parent,boolean[] toDelete,List<TreeNode> ans){
         if(toDelete[node.val]==true)
         {
             if(node.left!=null && toDelete[node.left.val]==false)
                 ans.add(node.left);
             if(node.right!=null && toDelete[node.right.val]==false )
                 ans.add(node.right);
            if (parent != null) {
                if (parent.left == node) 
                    parent.left = null;
                if (parent.right == node) 
                    parent.right = null;
            }
         }
          if(node.left!=null)
              deleteNodes(node.left,node,toDelete,ans);
            
            if(node.right!=null)
              deleteNodes(node.right,node,toDelete,ans);
     }
    
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        boolean[] toDelete=new boolean[1001];
        for(int n:to_delete)
            toDelete[n]=true;
            
            List<TreeNode> ans=new ArrayList<>(1000);
            
            if(toDelete[root.val]==false)
                ans.add(root);
            
            deleteNodes(root,null,toDelete,ans);
            
        
        return ans;
    }
}