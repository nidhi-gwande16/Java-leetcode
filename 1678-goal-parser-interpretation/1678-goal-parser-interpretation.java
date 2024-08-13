class Solution {
    public String interpret(String command) {
      StringBuilder sb=new StringBuilder();
        int i=0;
        int n=command.length();
        while(i<n)
        {
            char ch=command.charAt(i);
            if(ch=='G')
                sb.append('G');
            else if(ch=='(')
            {
                if(command.charAt(i+1)==')')
                {
                    sb.append("o");
                    i++;
                        
                }
                else{
                    sb.append("al");
                    i=i+3;
                }
            }
            i++;
        }
        return sb.toString();
        
    }
}