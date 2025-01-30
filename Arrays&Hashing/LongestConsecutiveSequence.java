class Solution 
{
    public int longestConsecutive(int[] nums)
    {
        Map<Integer,Integer> map = new HashMap<>();

        int   longest  = 0;

        for(int num:  nums)
        {
            if(!map.containsKey(num))
            {
                int before = map.getOrDefault(num -1, 0);
                int after = map.getOrDefault(num + 1, 0);
                
                map.put(num, before + after + 1);
                map.put(num - map.getOrDefault(num - 1, 0), map.get(num)); 
                map.put(num  + map.getOrDefault(num + 1, 0), map.get(num)); 

 
                longest = Math.max(longest, map.get(num));

            }
            
        }
        return longest;
    }
}
