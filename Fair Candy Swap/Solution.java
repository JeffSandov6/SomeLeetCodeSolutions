class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        
        int[] ans = new int[2];
        
        int iterA = 0;
        int iterB = 0;
        
        int aliceTotal = 0;
        int bobTotal = 0;
        
        HashSet<Integer> aliceCandySet = new HashSet<>();
        
        while(iterA < A.length || iterB < B.length)
        {
            if(iterA < A.length)
            {
                aliceTotal += A[iterA];
                aliceCandySet.add(A[iterA]);
            }
            
            if(iterB < B.length)
            {
                bobTotal += B[iterB];
            }
            
            iterA++;
            iterB++;
        }
        
        int dif = (aliceTotal - bobTotal) / 2;
        
        
        for(int i = 0; i < B.length; i++)
        {
            if(aliceCandySet.contains(B[i] + dif))
            {
                ans[0] = B[i] + dif;
                ans[1] = B[i];
            }
        }
        
        return ans;
        
    }
    
    
}
