class Solution {
    public String sortSentence(String s) {
        String[] spl=s.split(" ");
        String[] arr=new String[spl.length];
        for(String p:spl)
        {
            int n=p.length();
            int position=p.charAt(n-1)-48;
            arr[position-1]=p.substring(0,n-1);
        }
        
        StringBuilder sb=new StringBuilder();
        
        for(String p:arr)
        {
           sb.append(p);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}