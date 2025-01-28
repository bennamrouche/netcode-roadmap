import java.util.*;

class Solution {

    public List<List<String>> groupAnagrams(String[] strs) 
    {

        List<List<String>>  result  = new  ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        int  index  =  0; 
        for(String item: strs)
        {
            char a[] = item.toCharArray(); 
            Arrays.sort(a); 
            Integer i = map.get(String.valueOf(a));
            if(i != null)
            {
                result.get((int)i).add(item);
            }   
            else 
            {
                List<String> tmp = new ArrayList<>();
                tmp.add(item);
                result.add(tmp);
                map.put(String.valueOf(a),index);
                index++;
            }

        }// end first for     
        return result;
    }
}