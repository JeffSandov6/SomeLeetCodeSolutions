class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        List<Integer> retList = new ArrayList<Integer>();
        
        for(int num : nums)
        {
            countMap.put(num, countMap.getOrDefault(num, 0) +1);
            
            if(countMap.get(num) == 2)
            {
                retList.add(num);
            }
        }
        
        return retList;
    }
}
