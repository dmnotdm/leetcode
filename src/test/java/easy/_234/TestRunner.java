package easy._234;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * <a>https://leetcode-cn.com/problems/palindrome-linked-list/</a>
 *
 * WA次数：1
 * 神tm样例给个null
 *
 * @author zhizhao.zhang
 * @date 2020/10/23
 */
public class TestRunner {
    @Test
    public void test() {
        assertTrue(new Solution().isPalindrome(null));
        assertTrue(new Solution().isPalindrome(create(1)));
        assertTrue(new Solution().isPalindrome(create(1, 1)));
        assertTrue(new Solution().isPalindrome(create(1, 2, 1)));
        assertTrue(new Solution().isPalindrome(create(1, 2, 3, 2, 1)));
        assertTrue(new Solution().isPalindrome(create(1, 2, 3, 3, 2, 1)));
        assertFalse(new Solution().isPalindrome(create(1, 2)));
        assertFalse(new Solution().isPalindrome(create(1, 2, 3)));
        assertFalse(new Solution().isPalindrome(create(1, 2, 1, 1)));
    }

    private ListNode create(int... values) {
        ListNode p = new ListNode(0);
        ListNode h = p;
        for (int value : values) {
            p.next = new ListNode(value);
            p = p.next;
        }
        return h.next;
    }
}
