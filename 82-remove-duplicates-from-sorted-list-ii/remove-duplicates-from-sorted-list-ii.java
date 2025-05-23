/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(head!= null){
            int i = head.val;
            map.put(i,map.getOrDefault(i,0)+1);
            head = head.next;
        }
        head = temp;
        ListNode dummy = new ListNode(0);
        ListNode head2 = dummy;
        while(head!= null){
            int i = head.val;
            if(map.get(i)==1){
                dummy.next=new ListNode(i);
                dummy = dummy.next;
            }
            head=head.next;
        }
        return head2.next;

    }
}