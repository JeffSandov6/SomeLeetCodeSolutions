class Solution {
    public String toLowerCase(String str) {
        
        StringBuilder strBldr = new StringBuilder();
        
        for(int i = 0; i < str.length(); i++)
        {
            char cur = (str.charAt(i) >= 65 && str.charAt(i) <= 90) ? (char) (str.charAt(i) + 32) : str.charAt(i);
            
            strBldr.append(cur);
        }
        
        return strBldr.toString();
    }
}
