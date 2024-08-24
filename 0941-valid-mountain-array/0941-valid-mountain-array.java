class Solution {
    public boolean validMountainArray(int[] arr) {
      if(arr.length<3) 
          return false;
        
      int peaks=0;
        for(int i=1;i<arr.length-1;i++)
        {
            int previous=arr[i-1];
            int current=arr[i];
            int next=arr[i+1];
            if(previous==current || current==next)
                return false;
            if(previous>current && current<next)
                return false;
            if(previous<current && current>next)
            {
                peaks++;
                if(peaks>1)
                    return false;
                
            }
        }
        return peaks==1;
    }
}