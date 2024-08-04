class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb=new StringBuilder(s.replaceAll("-","").toUpperCase());
        StringBuilder result=new StringBuilder();
        sb.reverse();
        
        int n=sb.length();
        for(int i=0;i<n;i=i+k){
            if(i+k<=n)
                result.append(sb.substring(i,i+k));
            else
                result.append(sb.substring(i));
            
            if(i+k<n)
                result.append("-"); 
        }
        return result.reverse().toString();
    }
}