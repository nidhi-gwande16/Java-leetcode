class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result =new ArrayList<>();
       sol(1,k,n,new ArrayList<>(),result); 
        return result;
    }
    private void sol(int i,int k, int n , List<Integer> current ,List<List<Integer>> result)
    {
        if(n==0 && k==0)
        {
            result.add(current);
            return;
        }
        if(i>9)
            return ;
        if(n<0 || k<0)
            return;
        
        List<Integer> temp =new ArrayList<>(current);
        temp.add(i);
        sol(i+1,k-1,n-i,temp,result);
        sol(i+1,k,n,current,result);
    }
}