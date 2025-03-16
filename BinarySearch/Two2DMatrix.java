class Solution {
    public boolean searchMatrix(int[][] matrix, int target)
    {
        int start = 0;
        int end = matrix[0].length * matrix.length - 1;


        while(start <= end)
        {
            int center = start + (end - start) / 2;

            int x  = center %  matrix[0].length;
            int y  = center /  matrix[0].length; 

            if(matrix[y][x] == target)
                return true;

            if(matrix[y][x] <  target)
                start = center + 1;

            if(matrix[y][x] >  target)
                end = center -1;

        }

     return false; 
        
    }
}
