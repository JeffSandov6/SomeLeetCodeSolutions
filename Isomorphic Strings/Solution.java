class Solution {
    public boolean isIsomorphic(String s, String t) 
    {
        HashMap<Character, Character> charMap = new HashMap<Character, Character>();
        HashSet<Character> mappedToSet = new HashSet<Character>();
        
        for(int i = 0; i < t.length(); i++)
        { 
            if(!charMap.containsKey(s.charAt(i)))
            {
                charMap.put(s.charAt(i), t.charAt(i));
                if(mappedToSet.contains(t.charAt(i)))
                {
                    return false;
                }
                
                mappedToSet.add(t.charAt(i));
            }
            else 
            {
                if(charMap.get(s.charAt(i)) != t.charAt(i))
                {
                    return false;
                }           
                
            }
              
        }
        return true; 
    }
}
