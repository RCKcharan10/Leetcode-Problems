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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode temp = dummy;


        while(temp.next != null && temp.next.next != null){
            ListNode cur = temp.next;
            ListNode next = temp.next.next;
            cur.next = next.next;
            next.next = cur;
            temp.next = next;

            temp = cur;
        }

        return dummy.next;

    }
}