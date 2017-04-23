/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        if(head.next == null) return head;
        ListNode temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        ListNode tail = temp.next;
        temp.next = null;
        tail.next = head;
        head = head.next;
        tail.next.next = null;
        if(head == null) return tail;
        while(head != null) {
            temp = tail.next;
            tail.next = head;
            head = tail.next.next;
            tail.next.next = temp;
        }
        return tail;
    }
}
