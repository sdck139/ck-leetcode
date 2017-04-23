/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode last;
        ListNode top = head;
        while(true) {
            last = head;
            if(head.next == null) return top;
            head = head.next;
            if(last.val == head.val) {
                last.next = head.next;
                head = last;
            }
        }
    }
}
