class Solution {
    public int maxRepeating(String sequence, String word) {
        String find=word;
        int count=0,beg=0;
        
        while(true)
        {
            int index=sequence.substring(beg).indexOf(find);
            if(index==-1)
                return count;
            else
            {
                count++;
                find=find+word;
                beg=index;
            }
        }
    }
}