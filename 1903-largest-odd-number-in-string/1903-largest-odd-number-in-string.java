class Solution {
    public String largestOddNumber(String num) {
        int len=num.length()-1;
        
        while(len>=0)
        {
            int a=num.charAt(len)-'0';
            if(a%2!=0)
                return num.substring(0,len+1);
            len--;
        }
        return "";
    }
}