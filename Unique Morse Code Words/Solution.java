class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String[] morseCode = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        HashSet<String> uniqueWords = new HashSet<String>();
        
        for(String curWord : words)
        {
            StringBuilder strBldr = new StringBuilder();
            for(char curChar : curWord.toCharArray())
            {
                strBldr.append(morseCode[curChar - 97]);
            }
            
            uniqueWords.add(strBldr.toString());
            
        }
        
        
        
        return uniqueWords.size();
    }
}
