

class Solution 
{
    public int maxArea(int[] heights) 
    {
        int result = 0;
        int temp = 0;
        int left = 0;
        int right = heights.length - 1;

        while(right > left )
        {
            temp  =  (right - left) * Math.min(heights[left] ,heights[right]); 
            result = Math.max(result,temp);
            System.out.println(temp);
            if(heights[left] <  heights[right])
                left++;
            else 
                right--;
        }
        return result;
    }
}

