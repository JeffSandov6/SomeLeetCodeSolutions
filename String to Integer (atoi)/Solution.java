class Solution {
    public int myAtoi(String str) {
        
        boolean isNegative = false;
        StringBuilder strBldr = new StringBuilder();
        boolean seenFirstNum = false;
        boolean seenFirstSign = false;
        
        for(char curChar : str.toCharArray())
        {
            //first check for spaces, then check for neg or positive sign
            
            System.out.println(curChar);
            if(curChar == 32)
            {
                if(seenFirstNum == true || seenFirstSign == true)
                {
                    break;
                }
                continue;
            }
            
            if(seenFirstSign && (curChar == 45 || curChar == 43))
            {
                break;
            }
            
            if(curChar == 45) //negative sign
            {
                if(seenFirstNum == true)
                {
                    break;
                }
                isNegative = true;
                seenFirstSign = true;
                continue;
            }
            
            if(curChar == 43)
            {
                
                seenFirstSign = true;
                continue;
            }
            
            
            if(isNumber(curChar))
            {
                strBldr.append(curChar);
                seenFirstNum = true;
            }
            else
            {
                break;
            }
            
        }
        
        
        if(strBldr.length() == 0)
        {
            return 0;
        }
        
        String numAsString = strBldr.toString();
        
        
        int index = 0;
        int finalNum = 0;
        while(index < numAsString.length()){
            int curDigit = numAsString.charAt(index) - '0';
            
            // if(curDi < 0 || digit > 9) 
            // {
            //     break;
            // }

            //check if total will be overflow after 10 times and add digit
            if(Integer.MAX_VALUE/10 < finalNum || Integer.MAX_VALUE/10 == finalNum && Integer.MAX_VALUE %10 < curDigit)
            {
                return isNegative == false ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
                

            finalNum = 10 * finalNum + curDigit;
            index++;
        }
        
        
        
        
        
        if(isNegative)
        {
            finalNum = finalNum * -1;
        }
        
        
        
        
        return finalNum;
    }
    
    
    public boolean isNumber(char character)
    {
        if(character >= 48 && character <= 57)
        {
            return true;
        }
        
        return false;
    }
}
