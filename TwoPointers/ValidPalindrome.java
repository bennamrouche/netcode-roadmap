class Solution 
{ 
    public boolean isPalindrome(String s)
    {
        char array[] = s.toLowerCase().replaceAll("[^a-z0-9]","").toCharArray();           
        int left  =  0; 
        int right = array.length - 1;
        while(right  != -1)
        {    
            if(array[left] != array[right]) return false;  
            left++;
            right--; 
        }
        
        return true;
    }
}