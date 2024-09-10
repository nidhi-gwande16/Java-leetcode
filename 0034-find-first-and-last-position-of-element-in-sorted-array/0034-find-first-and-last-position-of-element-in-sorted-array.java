class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result=new int[2];
        result[0]=firstPosition(nums,target);
        result[1]=lastPosition(nums,target);
        return result;
    }
    int firstPosition(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        int first=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target)
            {
                first=mid;
                right=mid-1;
            }
            else if(nums[mid]<target)
            {
                left=mid+1;
            }
            else
            {
               right=mid-1; 
            }
        }
        return first;
    }
    int lastPosition(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        int last=-1;
        while(left<=right){
           int mid=(left+right)/2;
            if(nums[mid]==target)
            {
                last=mid;
                left=mid+1;
            } 
            else if(nums[mid]<target)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return last;
        
    }
}