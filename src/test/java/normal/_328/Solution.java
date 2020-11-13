package normal._328;

/**
 * @author zhizhao.zhang
 * @date 2020/11/13
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        boolean b = true;
        ListNode j = new ListNode();
        ListNode o = new ListNode();
        ListNode re = j;
        ListNode flag = o;
        ListNode p = head;
        for (; p != null; p = p.next, b = !b) {
            if (b) {
                j.next = p;
                j = p;
            } else {
                o.next = p;
                o = p;
            }
        }
        o.next = null;
        j.next = flag.next;
        return re.next;
    }
}
