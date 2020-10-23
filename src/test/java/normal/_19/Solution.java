package normal._19;

/**
 * @author zhizhao.zhang
 * @date 2020/10/23
 **/
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode r = head;
        while (n-- > 0) {
            r = r.next;
        }

        if (r == null) {
            return head.next;
        }

        ListNode l = head;
        while (r.next != null) {
            l = l.next;
            r = r.next;
        }

        l.next = l.next.next;
        return head;
    }

}
