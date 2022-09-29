/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
  public static ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode t = head;
    ListNode s = head;

    if (s.next == null || t.next == null) {
      return null;
    }

    if (s.next.next == null) {
      if (n == 1) {
        s.next = null;
        return s;
      }
      return s.next;

    }

    for (int i = 0; i <= n; i++) {
      if (t.next == null && i == n - 1) {
        return head.next;
      }
      t = t.next;
    }
    while (t != null) {
      t = t.next;
      s = s.next;
    }
    s.next = s.next.next;

    return head;
  }
}