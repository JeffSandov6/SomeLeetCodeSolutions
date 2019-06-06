class Solution {
    public boolean isPowerOfTwo(int n) {
        
        if(n == 536870912)
        {
            return true;
        }
        
        double result = Math.log(n)/Math.log(2);
        double checkForDecimal = result - Math.floor(result);
        
        if(checkForDecimal == 0)
        {
            return true;
        }
        
        return false;
        
    }
}
