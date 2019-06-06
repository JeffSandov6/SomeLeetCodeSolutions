class Solution {
    public String convertToTitle(int n) {
        HashMap<Integer, Character> map = new HashMap<Integer, Character>();
        

        
        char alphaChars = 65;
        for(int i = 1; i < 27; i++)
        {
            map.put(i, alphaChars);
            alphaChars++;
        }
        
        
        StringBuilder strBldr = new StringBuilder();
                
        if(n <= 26)
        {
            strBldr.append(map.get(n));
            return strBldr.toString();
        }
        
        
        while(n > 26)
        {
            int mod = n % 26;
            if(mod == 0)
            {
                strBldr.insert(0, map.get(26));
                n = n/26;
                n = n - 1;
                continue;
            }
            else
            {
                strBldr.insert(0, map.get(mod));
            }
            
            n = n/26;
            
        }

        
        strBldr.insert(0, map.get(n));
        
        return strBldr.toString();

    }
    
    
}
