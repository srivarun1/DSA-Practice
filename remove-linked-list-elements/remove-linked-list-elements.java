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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        ListNode trav = head;
        
        while(trav != null && trav.next != null)
        {
            if(trav.next.val == val){
                trav.next = trav.next.next;
            }
            else{
                trav = trav.next;
            }
        }
        
        return head.val == val ? head.next : head;
    }
}