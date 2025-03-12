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
    private TreeNode first = null;  
    private TreeNode second = null;  
    private TreeNode prev = new TreeNode(Integer.MIN_VALUE); 

    public void recoverTree(TreeNode root) {  
        inorderTraversal(root);  
        
        
        if (first != null && second != null) {  
            int temp = first.val;  
            first.val = second.val;  
            second.val = temp;  
        }  
    }  

    private void inorderTraversal(TreeNode root) {  
        if (root == null) {  
            return;  
        }  
          
        inorderTraversal(root.left);  
        
        
        if (prev != null) {  
         
            if (prev.val > root.val) {  
                
                if (first == null) {  
                    first = prev; 
                }   
                second = root;
            }  
        }   
         
        prev = root;  
         
        inorderTraversal(root.right); 
    } 
}