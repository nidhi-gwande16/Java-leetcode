class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
       Arrays.sort(tokens);
        int score=0;
        int i=0, j=tokens.length-1;
        
        while(i<=j)
        {
            if(tokens[i]<=power)
            {
                score++;
                power=power-tokens[i++];
                
            }
            else if(score>0 && tokens[i]<=(power + tokens[j]) && i!=j )
            {
                power=power+tokens[j--];
                score--;
                
            }
            else 
                break;
                
        }
        return score;
    }
}