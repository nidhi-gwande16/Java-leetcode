class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       if(matrix.length ==0 || matrix[0].length==0)
           return false;
        
        int m=matrix.length , n=matrix[0].length;
        int row=0, col=n-1;
        while(col>=0 && row<m)
        {
            if(matrix[row][col]==target)
                return true;
            else if(matrix[row][col] > target)
                col--;
            else row++;
        }
        return false;
    }
}