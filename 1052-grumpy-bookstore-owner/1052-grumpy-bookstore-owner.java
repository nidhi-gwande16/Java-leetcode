class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
       int count=0; //count of satisfied customers
       int extra=0; //count of satisfied customers after taking medicine 
       int max_add=0; //maximum count of extra satisfied customers
       
        for(int i=0;i<customers.length;i++)
        {
            if(grumpy[i]==0)
                count=count+customers[i];
            else
                extra=extra +customers[i];
            
            if(i>=minutes && grumpy[i-minutes]==1)
                extra=extra-customers[i-minutes];
            if(extra>max_add)
                max_add=extra;
        }
        return count+ max_add;
    }
}