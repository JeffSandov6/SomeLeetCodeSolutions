class Solution {
    public int numUniqueEmails(String[] emails) {
        
        int uniqueEmails = 0;
        HashSet<String> emailSet = new HashSet<String>();
        
        for(String cur : emails)
        {
            String[] split = cur.split("@");
            
            StringBuilder strBldr = new StringBuilder();
            for(char curChar : split[0].toCharArray())
            {
                if(curChar == '.')
                {
                    continue;
                }
                else if (curChar == '+')
                {
                    break;
                }
                else
                {
                    strBldr.append(curChar);
                }
            }
            
            strBldr.append(split[1]);
            
            if(!emailSet.contains(strBldr.toString()))
            {
                emailSet.add(strBldr.toString());
                uniqueEmails++;
            }
            
        }
        
        return uniqueEmails;
    }
}
