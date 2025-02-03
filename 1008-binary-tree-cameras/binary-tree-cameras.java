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
    int ans=0;
    // condition 1=no need
    // condition 2=require
    // condition 3=need of camera
    public int minCameraCover(TreeNode root) {
        int a= func(root);
        if(a==3) ans++;
        return ans;
    }
    public int func(TreeNode root){
        if(root==null) return 1;
        if(root.left== null && root.right==null) return 3;
        int l = func(root.left);
        int r = func(root.right);
        if(l==3 || r==3){
            ans++;
            return 2;
        }
        if(l==2 || r==2){
            return 1;
        }
        return 3;
    }
}