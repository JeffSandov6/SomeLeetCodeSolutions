class Solution {
    public String reverseWords(String s) {
        
        StringBuilder strBldr = new StringBuilder();
        String[] allWords = s.split(" ");
        
        for(String curWord : allWords)
        {
            for(int i = curWord.length() - 1; i >= 0; i--)
            {
                strBldr.append(curWord.charAt(i));
            }
            strBldr.append(" ");
        }
        
        strBldr.setLength(strBldr.length() - 1);
        
        return strBldr.toString();
        
    }
}
