class Solution {

     public String getPermutation(int n, int k) {
        
        //this array holds the factorials
        int[] factorials = new int[n + 1];
         
        ArrayList<Integer> remainingNums = new ArrayList<>();
        
        //0th index will be 1
        factorials[0] = 1;
         
        //in this loop, we calculate all of our factorials,
        //and also add all numbers to our ArrayList
        for (int i = 1; i <= n; i++) 
        {
            factorials[i] = i * factorials[i - 1];
            remainingNums.add(i);
        }
        
        StringBuilder strBldr = new StringBuilder();
        //subtract 1 bc of 0th index convention
        k--;
        
        for (int i = 1; i <= n; i++) 
        {
            int idx = k / factorials[n - i];
            strBldr.append(String.valueOf(remainingNums.get(idx)));
            remainingNums.remove(idx);
            //this subtracts the number of combinations we are no longer able to get
            //(bc we removed a value)
            k -= idx * factorials[n - i];
        }
        
        return strBldr.toString();
    }
    

}
