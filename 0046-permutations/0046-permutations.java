class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        find(nums,result,new ArrayList<>(),new boolean[nums.length]);
        
        return result ;
    }
    
    void find(int[]nums,List<List<Integer>> result,List<Integer> currentList ,boolean[] usedValues)
    {
        if(currentList.size()==nums.length)
        {
            result.add(new ArrayList<>(currentList));
                return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(usedValues[i]==true)
                continue;
            currentList.add(nums[i]);
            usedValues[i]=true;
            
            find(nums,result,currentList,usedValues);
            currentList.remove(currentList.size()-1);
            
            usedValues[i]=false;
        }
    }
}