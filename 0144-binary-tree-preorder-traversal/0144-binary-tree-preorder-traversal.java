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
    public List<Integer> preorderTraversal(TreeNode root) {
        TreeNode temp=root;
        ArrayList<Integer> arr=new ArrayList<>();
        return preorder(temp,arr);
    }
    List<Integer> preorder(TreeNode temp,ArrayList<Integer> arr)
    {
        {
            if(temp==null)
                return arr;
            arr.add(temp.val);
            preorder(temp.left,arr);
            preorder(temp.right,arr);
            return arr;
        }
    }
}