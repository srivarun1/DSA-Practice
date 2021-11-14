/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode hare = head;
        ListNode tort = head;
        
        while(hare!= null && hare.next != null){
            hare = hare.next.next;
            tort = tort.next;
            if(hare != null)
                if(hare.equals(tort)) return true;
        }
        
        return false;
    }
}