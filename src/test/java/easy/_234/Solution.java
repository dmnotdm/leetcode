package easy._234;

/**
 * @author zhizhao.zhang
 * @date 2020/10/23
 */
class Solution {
    private static final ListNode e = new ListNode(0);

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        if (head.next.next == null) {
            return head.next.val == head.val;
        }
        ListNode p = foreach(head.next, head.next.next);
        return p != e && p.val == head.val;
    }

    /**
     * 是回文，返回l对应的r节点，否则返回e
     */
    private ListNode foreach(ListNode l, ListNode r) {
        //奇数项出口
        if (r.next == null) {
            return l.next;
        }
        r = r.next;
        //偶数项出口
        if (r.next == null) {
            if (l.val != l.next.val) {
                return e;
            }
            return l.next.next;
        }
        ListNode rn = foreach(l.next, r.next);
        if (rn == e) {
            return e;
        }
        return l.val == rn.val ? rn.next : e;
    }
}