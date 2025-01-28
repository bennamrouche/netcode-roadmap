import java.util.*;
/*
 
*/
class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();

        int result[] = new int[k];

        result[0] = nums[0];
        for(int i = 0; i < nums.length;  i++)
        {
                mp.put(nums[i],mp.getOrDefault(nums[i], 0) + 1);
        }
        
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b)-> a[0] - b[0] );
        for(Map.Entry<Integer, Integer>  entry : mp.entrySet())
        {
            queue.offer(new int[]{entry.getValue(), entry.getKey()});
            if (queue.size() > k){
                    queue.poll();
            }
        }
        for(int i = 0; i < k; i++)
        {
            result[i] = queue.poll()[1];
        }

        return  result;
    }
}