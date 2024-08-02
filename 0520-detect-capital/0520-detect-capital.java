class Solution {
    public boolean detectCapitalUse(String word) {
      int capital=0 , low=0,first=0;
        for(char ch:word.toCharArray())
        {
            if(ch>=65 && ch<=90)
            {
                capital++;
                if(first==0)
                    first=1;
            }
            else{
                low++; 
                if(first==0)
                    first=2;
            }
                
        }
        if(capital==0||low==0 ||first==1 && capital==1)
          return true;
        else
           return false;
    }
}