class Solution {
    public int twoCitySchedCost(int[][] costs) {
        
        int minCost = 0;
        
        if(costs.length == 0)
        {
            return minCost;
        }
        
        int[] cityDifference = new int[costs.length];
        
        for(int i = 0; i < costs.length; i++)
        {
            minCost = minCost + costs[i][1]; //cost of all b
            
            cityDifference[i] = costs[i][0] - costs[i][1];
        }
        
        Arrays.sort(cityDifference);
        
        
        for(int i = 0; i < costs.length/2; i++)
        {
            minCost += cityDifference[i];
        }
        
        return minCost;
    }
}
