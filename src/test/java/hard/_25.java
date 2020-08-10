package hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * <a>https://leetcode-cn.com/problems/reverse-nodes-in-k-group/</a>
 *
 * @author zhizhao.zhang
 * @date 2020/08/07
 */
public class _25 {

    @Test
    public void test() {
        Assertions.assertEquals(parseString(new Solution().reverseKGroup(createList(6), 1)), "123456");
        Assertions.assertEquals(parseString(new Solution().reverseKGroup(createList(6), 2)), "214365");
        Assertions.assertEquals(parseString(new Solution().reverseKGroup(createList(6), 3)), "321654");
        Assertions.assertEquals(parseString(new Solution().reverseKGroup(createList(6), 4)), "432156");
        Assertions.assertEquals(parseString(new Solution().reverseKGroup(createList(6), 6)), "654321");
    }

    private ListNode createList(int len) {
        ListNode h = new ListNode(1);
        ListNode p = h;
        for (int i = 2; i <= len; i++) {
            p.next = new ListNode(i);
            p = p.next;
        }
        return h;
    }

    private String parseString(ListNode p) {
        StringBuilder sb = new StringBuilder(String.valueOf(p.val));
        p = p.next;
        while (p != null) {
            sb.append(p.val);
            p = p.next;
        }
        return sb.toString();
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return String.valueOf(val);
        }
    }

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
}
