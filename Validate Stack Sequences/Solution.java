class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
        
        if(pushed.length == 0 && popped.length == 0)
        {
            return true;
        }
        
        
        int pushedIter = 1;
        int poppedIter = 0;
        Stack<Integer> stack = new Stack<Integer>();
        
        stack.push(pushed[0]);
        while(pushedIter < pushed.length && poppedIter < popped.length)
        {
            if(stack.empty())
            {
                stack.push(pushed[pushedIter]);
                pushedIter++;
                continue;
            }
            
            if(stack.peek() == popped[poppedIter])
            {
                stack.pop();
                poppedIter++;
            }
            else
            {
                stack.push(pushed[pushedIter]);
                pushedIter++;
            }      
        }
        
        while(poppedIter < popped.length)
        {
            if(stack.peek() == popped[poppedIter])
            {
                stack.pop();
                poppedIter++;
            }
            else
            {
                return false;
            }
            
        }
        
        
        
        return true;
        
    }
}
