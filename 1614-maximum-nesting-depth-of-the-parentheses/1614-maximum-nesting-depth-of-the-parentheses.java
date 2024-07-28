class Solution {
    public int maxDepth(String s) {
        int current=0 ,max=0;
            for(char ch:s.toCharArray())
            {
                if(ch=='(')
                {
                    current++;
                    if(current>max)
                        max=current;
                }
                else if(ch==')')
                {
                    current--;
                }
            }
        return max;
    }
}