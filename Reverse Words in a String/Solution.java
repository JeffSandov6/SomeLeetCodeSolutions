class Solution {
    public String reverseWords(String s) {
        
        String[] wordsAsList = s.split("\\s+");
        
        if(wordsAsList.length == 0 || (wordsAsList.length == 1 && wordsAsList[0].length() == 0))
        {
            return "";
        }
        
        
        StringBuilder strBldr = new StringBuilder();
        
        for(int i = wordsAsList.length - 1; i > 0; i--)
        {
            strBldr.append(wordsAsList[i] + " ");
        }
        
        if(wordsAsList[0].length() == 0)
        {
            strBldr.setLength(strBldr.length() - 1); //remove last space
        }
        else
        {
            strBldr.append(wordsAsList[0]);
        }
        
        
        
        return strBldr.toString();
    }
}
