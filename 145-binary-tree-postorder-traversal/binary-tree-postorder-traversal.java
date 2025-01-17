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
        List<Integer> ll = new ArrayList<>();
        post(root,ll);
        return ll;
    }
    public void post(TreeNode root,List<Integer> ll){
        if(root==null){
            return;
        }
        post(root.left,ll);
        post(root.right,ll);
        ll.add(root.val);
    
    }
}