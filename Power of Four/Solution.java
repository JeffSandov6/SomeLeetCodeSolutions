class Solution {
    public boolean isPowerOfFour(int num) {
        
        double result = Math.log(num)/Math.log(4);
        double checkForDecimal = result - Math.floor(result);
        
        if(checkForDecimal == 0)
        {
            return true;
        }
        
        return false;
        
    }
}
