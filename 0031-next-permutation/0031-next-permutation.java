class Solution {
    void reverse(int[] nums,int start) {
        int end=nums.length-1;
        while(start<end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            end--;
            start++;
        }
    }
    public void nextPermutation(int[] nums) {
        int breakPoint=-1;
        int index=-1;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                breakPoint=i;
                break;
            }
        }
        if(breakPoint==-1)
            reverse(nums,0);
        else
        {
            for(int j=nums.length-1;j>=0;j--)
            {
                if(nums[j]>nums[breakPoint])
                {
                    index=j;
                    break;
                }
            }
            //swap
            int temp=nums[breakPoint]; 
            nums[breakPoint]=nums[index];
            nums[index]=temp;
            reverse(nums,breakPoint+1);
        }
    }
    
}