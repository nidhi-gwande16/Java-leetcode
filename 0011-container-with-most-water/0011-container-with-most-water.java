class Solution {
    public int maxArea(int[] height) {
        int maxArea=0;
        int currentArea=0;
        int left=0;
        int right=height.length-1;
        
        while(left<right)
        {
            if(height[left]<=height[right])
            {
                currentArea=height[left]*(right-left);
                left++;
            }
            else{
                currentArea=height[right]*(right-left);
                right--;
            }
            if(currentArea>maxArea){
                maxArea=currentArea;
            }
        }
        return maxArea;
    }
}