/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public void traverse(List<Integer> ans,Node node)
    {
        if(node==null)
            return ;
        for(Node temp:node.children)
            traverse(ans,temp);
        ans.add(node.val);
    }
    public List<Integer> postorder(Node root) {
        List<Integer> ans=new ArrayList<>();
        traverse(ans,root);
        return ans;
    }
}