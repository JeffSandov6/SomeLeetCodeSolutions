class Solution {
    public int numJewelsInStones(String J, String S) {
        
        HashSet<Character> jewels = new HashSet<Character>();
        
        for(char curChar : J.toCharArray())
        {
            jewels.add(curChar);
        }
        
        int count = 0;
        
        for(char curStone : S.toCharArray())
        {
            if(jewels.contains(curStone))
            {
                count++;
            }
        }
        
        
        return count;
    }
}
