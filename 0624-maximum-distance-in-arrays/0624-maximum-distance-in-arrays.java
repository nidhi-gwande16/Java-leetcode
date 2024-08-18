class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int mini=arrays.get(0).get(0);
        int index=arrays.get(0).size()-1;
        int max=arrays.get(0).get(index);
        
        int maxDistance=0;
        for(int i=1;i<arrays.size();i++)
        {
            int distance=Math.abs(max-arrays.get(i).get(0));
            if(distance>maxDistance)
                maxDistance=distance;
            
            
            index=arrays.get(i).size()-1;
            distance=Math.abs(arrays.get(i).get(index)-mini);
            if(distance>maxDistance)
                maxDistance=distance;
            
            mini=Math.min(mini,arrays.get(i).get(0));
            max=Math.max(max,arrays.get(i).get(index));
        }
        return maxDistance;
    }
}