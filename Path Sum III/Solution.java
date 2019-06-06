/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public int getChildSum(TreeNode curNode, int sumNeeded)
    {
        if(curNode == null)
        {
            return 0;
        }
        
        int curResult = (curNode.val == sumNeeded) ? 1 : 0;
        
        return curResult + getChildSum(curNode.left, sumNeeded - curNode.val)
            + getChildSum(curNode.right, sumNeeded - curNode.val);
        
    }
    
    public int pathSum(TreeNode root, int sum) {
        
        if(root == null)
        {
            return 0;
        }
        
        return getChildSum(root, sum) +
            pathSum(root.left, sum) + pathSum(root.right, sum);
        
    }
}
