class Solution {
    
    
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        //map will hold difficulty as key, and value as count
        HashMap<Integer, Integer> workerMap = new HashMap<Integer, Integer>();
        
        for(int curInt : worker)
        {
            workerMap.put(curInt, workerMap.getOrDefault(curInt, 0) + 1);
        }
        
        
        int totalProfit = 0;
        for(Map.Entry<Integer, Integer> curEntry : workerMap.entrySet())
        {
            int curKey = curEntry.getKey(); //worker max difficulty
            int curCount = curEntry.getValue();
            
            
            int difficultyIter = 0;
            int maxDifficulty = -1;
            int maxProfit = -1;
            for(int i = 0; i < difficulty.length; i++)
            {
                //this if is checking for whether the current worker can complete this job or not
                if(difficulty[i] <= curKey)
                {
                    //we will only change our task chosen iff it yields more profit
                    if(profit[i] > maxProfit)
                    {
                        maxDifficulty = difficulty[i];
                        difficultyIter = i;
                        maxProfit = profit[i];
                    }
                    
                }

            }
            
            
            totalProfit += (maxDifficulty == -1) ? 0 : profit[difficultyIter] * curCount;
            
        }
        
        return totalProfit;
    }
}
