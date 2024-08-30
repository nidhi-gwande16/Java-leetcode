class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> peak=new LinkedList<>();
        
        for(int i=1;i<mountain.length-1;i++)
        {
            int previous=mountain[i-1];
            int current=mountain[i];
            int next=mountain[i+1];
            
            if(previous<current && current>next)
                peak.add(i);
        }
        return peak;
    }
}