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
    public ListNode deleteDuplicatesUnsorted(ListNode head) {
        Map<Integer,Integer> map = new HashMap();
        ListNode curr = head;
        
        while(curr != null)
        {
            map.merge(curr.val,1,(x,y) -> x+y);
            curr = curr.next;
        }
        
        curr = new ListNode(-1);
        curr.next = head;
        head = curr;
        while(curr.next != null)
        {
            if(map.get(curr.next.val) > 1)
            {
                curr.next = curr.next.next;
            }
            else
            {
                //System.out.println(curr.next.val + " " + map.get(curr.next.val));
                curr = curr.next;
            }
        }
        
        return head.next;
    }
}