class Solution {
    public int findTheWinner(int n, int k) {
        int index=0;
        ArrayList<Integer> a1=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            a1.add(i);
        }
        while(a1.size()>1)
        {
            index=index+(k-1);
            index=index % a1.size();
            a1.remove(index);
        }
        return a1.get(0)+1;
    }
}