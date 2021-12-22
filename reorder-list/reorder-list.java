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
    public void reorderList(ListNode head) {
        if(head == null) return;
        
        ListNode itr = head;
        
        while(itr != null) {
            ListNode last = getLast(itr.next);
            if(last == null) break; 
                last.next = itr.next;
                itr.next = last;
                itr = last.next;
        
        }
    }
    
    private ListNode getLast(ListNode node) {
        if(node == null || node.next == null) return null;
        
        while(node.next.next != null) {
            node = node.next;
        }
        
        ListNode ret = node.next;
        node.next = null;
        return ret;
    }
}