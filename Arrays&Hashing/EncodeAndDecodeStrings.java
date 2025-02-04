
class Solution
{
    public static final char SP = '\u0000';
    public String encode(List<String> strs)
    {
        if(strs.size() == 0) return null;
        StringBuffer buffer = new StringBuffer();
        for(String item: strs)
        {   
            buffer.append(item);
            if(strs.size() > 1)
                buffer.append(Solution.SP);
        }
        return buffer.toString();
    }

    public List<String> decode(String str) 
    {
        if(str == null) return List.of();
        if(str.length() == 0) return  List.of("");


        String[] arr = str.split(Solution.SP + "");
        return List.of(arr); 
     
    }

}
