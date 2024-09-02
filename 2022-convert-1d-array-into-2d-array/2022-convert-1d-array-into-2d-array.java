class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length != m*n)
            return new int[0][0];
        int[][] ans=new int[m][n];
        int i=0;
        int j=0;
        for(int num:original)
        {
            ans[i][j++]=num;
            if(j>=n)
            {
                j=0;
                i++;
            }
        }
        return ans;
    }
}