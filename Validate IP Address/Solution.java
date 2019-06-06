class Solution {
    public String validIPAddress(String IP) {
        
        String[] ipv4 = IP.split("\\.");
        String[] ipv6 = IP.split(":");
        
        if(IP.length() == 0 || IP.charAt(IP.length() - 1) == ':' || IP.charAt(IP.length() - 1) == '.')
        {
            return "Neither";
        }
        
        if(ipv4.length == 4 && checkIPv4Validity(ipv4))
        {  
            return "IPv4";
            
        }
        
        if(ipv6.length == 8 && checkIPv6Validity(ipv6))
        {
            return "IPv6";
        }
        
        return "Neither";
        
    }
    
    public boolean checkIPv6Validity(String[] ip)
    {
        String numbers = ".*[0-9].*";
        String upperCase = ".*[A-F].*";
        String lowerCase = ".*[a-f].*";
        for(String cur : ip)
        {
            if(cur.length() == 0 || cur.length() > 4)
            {
                return false;
            }
            
            if(!checkValidityV6(cur))
            {
                return false;
            }

        }
        
        return true;
    }
    
    public boolean checkValidityV6(String curString)
    {
        for(char cur : curString.toCharArray())
        {
            if(cur <= 70 && cur >= 65)  //uppercase
            {
                continue;
            }
            else if(cur >= 97 && cur <= 102) //lowercase
            {
                continue;
            }
            else if(cur >= 48 && cur <= 57)
            {
                continue;
            }
            else
            {
                return false;
            }
        }
        
        return true;
    }
    
    public boolean checkIPv4Validity(String[] ip)
    {
        for(String cur : ip)
        {
            
            if(cur.length() == 0 || (cur.charAt(0) == '0' && cur.length() > 1) || cur.length() > 3)
            {
                return false;
            }
            
            if(cur.matches("[0-9]+"))
            {
                if(Integer.parseInt(cur) > 255)
                {
                    return false;
                }
            }
            else //if it contains numbers
            {
                return false;
            }

        }
        
        return true;
    }
    
    
}
