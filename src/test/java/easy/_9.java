package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * <a>https://leetcode-cn.com/problems/palindrome-number/</a>
 *
 * @author zhizhao.zhang
 * @date 2020/08/10
 */
public class _9 {
    @Test
    public void test() {
        Assertions.assertFalse(new Solution().isPalindrome(120));
        Assertions.assertFalse(new Solution().isPalindrome(-1));
        Assertions.assertFalse(new Solution().isPalindrome(-121));
        Assertions.assertTrue(new Solution().isPalindrome(0));
        Assertions.assertTrue(new Solution().isPalindrome(12321));
    }

    class Solution {
        public boolean isPalindrome(int x) {
            if (x < 0) {
                return false;
            }
            if (x < 10) {
                return true;
            }
            int y = 0, n = x;
            while (x > 0) {
                y = y * 10 + x % 10;
                x /= 10;
            }
            return n == y;
        }
    }
}
