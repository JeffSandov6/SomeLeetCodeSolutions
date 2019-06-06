/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        
        if(m == n)
        {
            return head;
        }
        
        Queue<ListNode> beforeMQueue = new LinkedList<ListNode>();
        Stack<ListNode> reverseListStack = new Stack<ListNode>();
        
        int counter = 1;
        
        ListNode curElem = head;
        ListNode remainingList;
        while(true)
        {
            if(counter < m)
            {
                beforeMQueue.add(curElem);
            }
            else if(counter >= m && counter <= n)
            {
                reverseListStack.push(curElem);
            }
            else //counter will be greater than n
            {
                remainingList = curElem;
                break;
            }
            
            counter++;
            curElem = curElem.next;
            
            if(curElem == null)
            {
                break;
            }
            
        }
        
        
        
        ListNode newHead = null;
        if(beforeMQueue.size() != 0)
        {
            newHead = beforeMQueue.remove();
        }
        
        
        ListNode nextElems;
        if(newHead == null)
        {
            newHead = reverseListStack.pop();
            nextElems = newHead;
        }
        else
        {
            nextElems = newHead;
            while(beforeMQueue.size() != 0)
            {
                nextElems.next = beforeMQueue.remove();
                nextElems = nextElems.next;
                
            }
        }
        
        while(!reverseListStack.empty())
        {
            nextElems.next = reverseListStack.pop();
            nextElems = nextElems.next; 
        }
        
        nextElems.next = curElem;
        
        return newHead;
        
    }
}
