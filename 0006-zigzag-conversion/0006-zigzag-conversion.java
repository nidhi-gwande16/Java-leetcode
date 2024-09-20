class Solution {
    public String convert(String s, int numRows) {
        String[] result=new String[numRows];
        for(int i=0;i<numRows;i++)
        {
            result[i]="";
        }
        
        int index=0;
        while(index <s.length())
        {
            for(int i=0;i<numRows && index<s.length();i++)
            {
                result[i]+= s.charAt(index++); 
            }
            for(int i=numRows-2;i>0 && index<s.length();i--)
            {
                result[i]+= s.charAt(index++); 
            }
        }
        String res="";
        for(String str:result)
        {
            res+=str;
        }
        return res;
    }
}