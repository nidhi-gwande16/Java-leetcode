class Solution {
    public String multiply(String num1, String num2) {
        char[] st1= reverse(num1);
        char[] st2= reverse(num2);
        int[] res=new int[st1.length+st2.length];
        for(int i=0;i<st1.length;i++)
        {
            int carry=0;
            int start=i;
           for(int j=0;j<st2.length;j++) 
           {
               int n1=st1[i]-'0';
               int n2=st2[j]-'0';
               int sum=(n1*n2)+res[start]+carry;
               int base=sum%10;
               carry=sum/10;
               res[start++]=base;
           }
            if(carry!=0)
                res[start]=carry; 
        }
        int i=res.length-1;
        while(i>0 && res[i]==0) 
            i--;
        String result="";
        while(i>=0){
            result=result+res[i--];
        }
        return result;
        
    }
    private char[] reverse(String num)
    {
        char[] result=num.toCharArray();
        int start=0, end=num.length()-1;
        while(start<end)
        {
            char temp=result[start];
            result[start]=result[end];
            result[end]=temp;
            start++;
            end--;
        }
        return result;
    }
}