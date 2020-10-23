package hard._25;

/**
 * <a>https://leetcode-cn.com/problems/reverse-nodes-in-k-group/</a>
 *
 * @author zhizhao.zhang
 * @date 2020/08/07
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1) {
            return head;
        }
        ListNode l, r, p, re = null, last;
        last = l = r = head;
        p = r.next;
        int ans = 1;
        while (p != null) {
            p = p.next;
            r = r.next;
            ans++;
            if (ans == k) {
                r.next = null;
                if (re == null) {
                    re = reverse(l, p);
                } else {
                    last.next = reverse(l, p);
                    last = l;
                }
                if (p == null) {
                    return re;
                }
                l = p;
                r = p;
                p = p.next;
                ans = 1;
            }
        }
        return re;
    }

    private ListNode reverse(ListNode head, ListNode next) {
        ListNode h = head;
        ListNode n = h.next;
        ListNode f = null;
        while (true) {
            h.next = f;
            f = h;
            h = n;
            if (h == null) {
                head.next = next;
                return f;
            }
            n = n.next;
        }
    }
}
