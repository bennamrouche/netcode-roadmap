/*
@author alphaben 
*/

import java.util.*; 

class Solution {

    public boolean containsDuplicate(int[] nums)
    {
        Set unique  = new HashSet<Integer>();
       
        for(int i = 0; i < nums.length; i++)
        {
            if(!unique.add(nums[i]))
                return true;
        }    
        return false; 
    } 

}