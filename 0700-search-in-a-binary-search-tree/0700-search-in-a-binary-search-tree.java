/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode temp=root;     
        return bst(temp,val);
    }
    
    TreeNode bst(TreeNode temp,int val)
    {
        if(temp==null)
            return null;
        if(temp.val==val)
            return temp;
        if(val<temp.val)
            return bst(temp.left,val);
        if(val>temp.val)
            return bst(temp.right,val);
        return null;
    }
}