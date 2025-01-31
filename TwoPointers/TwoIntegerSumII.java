class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        int left  = 0;
        int right = numbers.length - 1;
        int res = 0;

        while(left < right)
        {
            res = numbers[left] +  numbers[right]; 

            if(res == target) return new int[]{numbers[left], numbers[right]};
            if(res < target)
                left++;
            else 
                right--; 
        }

        return null;
    }
}