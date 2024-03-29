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
    public List<Integer> postorderTraversal(TreeNode root) {
        TreeNode temp=root;
        ArrayList<Integer> arr=new ArrayList<>();
        return preorder(temp,arr);
    }
    List<Integer> preorder(TreeNode temp,List<Integer> arr)
    {
        if(temp==null)
            return arr;
        preorder(temp.left,arr);
        preorder(temp.right,arr);
        arr.add(temp.val);
        return arr;
    }
}