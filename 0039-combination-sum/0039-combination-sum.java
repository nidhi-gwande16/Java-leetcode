class Solution {
    List<List<Integer>> result =new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        generateCombinations(candidates,target,0,new ArrayList<Integer>());
        return result;
    }
    void generateCombinations(int[] candidates,int currentTarget,int position, List<Integer> currentCombination)
    {
        if(currentTarget==0)
        {
            result.add(new ArrayList<>(currentCombination));
            return ;  
        }
        if(position==candidates.length){
            return;
        }
        if(candidates[position]<=currentTarget){
            currentCombination.add(candidates[position]);
            generateCombinations(candidates,currentTarget-candidates[position],position,currentCombination);
            currentCombination.remove(currentCombination.size()-1);
        }
        generateCombinations(candidates,currentTarget,position+1,currentCombination);
    }
}