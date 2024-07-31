class Solution {
    public int passThePillow(int n, int time) {
        int position=time%(n-1);
        int direction=time/(n-1);
        
        if(direction%2==0)
            return (1+position);
        else
            return (n-position);
        
    }
}