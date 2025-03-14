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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        in(root,ll);
        return ll;
    }
    public void in(TreeNode root,List<Integer> ll){
        if(root==null){
            return;
        }
        in(root.left,ll);
        ll.add(root.val);
        in(root.right,ll);
    
    }
}