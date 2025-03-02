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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ll = new LinkedList<List<Integer>>();
        Queue<TreeNode> que=new LinkedList<TreeNode>();
        if(root==null) return ll;
        que.offer(root);
        while(!que.isEmpty()){
            int lev= que.size();
            List<Integer> l = new LinkedList<Integer>();
            for(int i=0;i<lev;i++){
                if(que.peek().left!= null) que.offer(que.peek().left);
                if(que.peek().right!= null) que.offer(que.peek().right);
                l.add(que.poll().val);
            }
            ll.add(l);

        }
        Collections.reverse(ll);
        return ll;
    }
}