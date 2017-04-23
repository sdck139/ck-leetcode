/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        ListNode evenHead = head;
        if(head.next == null) return head;
        ListNode oddHead = head.next;
        head = oddHead.next;
        oddHead.next = null;
        ListNode tempEven = evenHead;
        ListNode tempOdd = oddHead;
        while(head != null) {
            tempEven.next = head;
            tempEven = head;
            head = head.next;
            if(head == null) break;
            tempOdd.next = head;
            tempOdd = head;
            head = head.next;
            tempOdd.next = null;
        }
        tempEven.next = oddHead;
        return evenHead;
    }
}
