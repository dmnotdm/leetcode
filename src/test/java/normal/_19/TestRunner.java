package normal._19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * <a>https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/</a>
 *
 * WA次数：2
 * 极限值判定
 *
 * @author zhizhao.zhang
 * @date 2020/10/23
 */
public class TestRunner {

    private ListNode create(int... args) {
        ListNode head = new ListNode();
        ListNode p = head;
        for (int arg : args) {
            head.next = new ListNode(arg);
            head = head.next;
        }
        return p.next;
    }

    private String print(ListNode p) {
        StringBuilder sb = new StringBuilder();
        while (p != null) {
            sb.append(p.val);
            p = p.next;
        }
        return sb.toString();
    }

    @Test
    public void test() {
        Assertions.assertEquals("", print(new Solution().removeNthFromEnd(create(1), 1)));
        Assertions.assertEquals("2", print(new Solution().removeNthFromEnd(create(1, 2), 2)));
        Assertions.assertEquals("1235", print(new Solution().removeNthFromEnd(create(1, 2, 3, 4, 5), 2)));
    }
}
