class Solution {
    public int minKBitFlips(int[] A, int K) {
        
        int N = A.length;
        
        //initialized to all 0s
        int[] hintAr = new int[N];
        
        int numFlips = 0;
        //flip keeps track of whether we are in a window that's been flipped or not, value will only be 0 or 1
        int flip = 0;
        
        // When we flip a subarray like A[i], A[i+1], ..., A[i+K-1]
        // we can instead flip our current writing state, and put a hint at
        // position i+K to flip back our writing state.
        for (int i = 0; i < N; ++i) {
            //get the XOR value of flip and hintAr[i], 
            //so if flip == 0 & hintAr[i] == 0, this means we havent changed anything at this position, nor are we to flip
            flip ^= hintAr[i];
            
            //if A[i] & flip both == 0, or if A[i] & flip both == 1
            if (A[i] == flip) {  // If we must flip the subarray starting here...
                numFlips++;  // We're flipping the subarray from A[i] to A[i+K-1]
                
                //If we can't flip the entire subarray, its impossible
                if (i + K > N) 
                {
                    return -1;
                }
                
                //get XOR value of flip and 1, only 1 if flip == 0
                flip ^= 1;
                if (i + K < N) //tells us that this is where the window (of cur K flips) ends (at i + K)
                {
                    hintAr[i + K] ^= 1;
                }
            }
        }

        return numFlips;
    }
                


}
