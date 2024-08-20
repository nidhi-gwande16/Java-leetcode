class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        int i=0;
        while(i<n)
        {
            if((i+2)<n && s.charAt(i+2)=='#')
            {
                String str=s.substring(i,i+2);
                int temp=Integer.parseInt(str);
                char c=(char)(temp+96);
                sb.append(c);
                i=i+3;
            }
            else
            {
                char c=s.charAt(i);
                sb.append((char)(c+48));
                i++;
            }
        }
        return sb.toString();
    }
}