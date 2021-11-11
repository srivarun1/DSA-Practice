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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp = head;
        ListNode prev = null;
        for(int i = 1 ;i < left;i++){
             prev = temp;
             temp = temp.next;
        }
        if(prev != null)
            prev.next = reverse(temp,right-left+1);
        else
          return reverse(temp,right-left+1);
        
        return head;
    }
    
    
    public ListNode reverse(ListNode head, int length){
        if(head == null) return null;
        ListNode prev = null;
        ListNode end = head;
        for(int i = 0; i < length && head != null; i++){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        end.next = head;
        return prev;
    }
}