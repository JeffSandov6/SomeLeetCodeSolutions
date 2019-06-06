class Solution {
    public int repeatedNTimes(int[] A) {
        HashMap<Integer, Integer> intMap = new HashMap<>();
        
        for(int i = 0; i < A.length; i++)
        {
            intMap.put(A[i], intMap.getOrDefault(A[i], 0) + 1);
        }
        
        int nValue = A.length/2;
        
        for(Map.Entry<Integer, Integer> curEntry : intMap.entrySet())
        {
            if(curEntry.getValue() == nValue)
            {
                return curEntry.getKey();
            }
        }
        
        return 0;
    }
}
