class Solution {
    public int[] plusOne(int[] digits) {
      for(int i=digits.length-1;i>=0;i--)
      {
          if(digits[i]<9)
          {
              digits[i]+=1;
              return digits;
          }
          digits[i]=0;//if 9
      }
        int[] arr=new int[digits.length+1]; //999=3  them 1000=4
        arr[0]=1;
        return arr;
    }
}