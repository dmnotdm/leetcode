package easy._9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhizhao.zhang
 * @date 2020/10/23
 */
public class TestRunner {

    @Test
    public void test() {
        Assertions.assertFalse(new Solution().isPalindrome(120));
        Assertions.assertFalse(new Solution().isPalindrome(-1));
        Assertions.assertFalse(new Solution().isPalindrome(-121));
        Assertions.assertTrue(new Solution().isPalindrome(0));
        Assertions.assertTrue(new Solution().isPalindrome(12321));
    }

}
