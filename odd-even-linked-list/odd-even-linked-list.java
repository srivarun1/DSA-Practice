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
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return head;
        ListNode oddList = head;
        ListNode evenList = head.next;
        ListNode start = oddList;
        ListNode tail = head.next;
       
        while((oddList != null && oddList.next != null) || (evenList != null && evenList.next != null)){
            if(oddList != null && oddList.next != null){
                oddList.next =  oddList.next.next;
                oddList = oddList.next;
            }
            
             if(evenList != null && evenList.next != null){
                evenList.next =  evenList.next.next;
                 evenList = evenList.next;
            }
        }
        
        while(start.next != null){
            start = start.next;
        }
        
        
        start.next = tail;
        
       
        
        return head;
    }

}