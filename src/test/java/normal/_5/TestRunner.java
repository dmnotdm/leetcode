package normal._5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhizhao.zhang
 * @date 2020/10/23
 */
public class TestRunner {

    @Test
    public void test() {
        Assertions.assertEquals(new Solution().longestPalindrome(""), "");
        Assertions.assertEquals(new Solution().longestPalindrome("a"), "a");
        Assertions.assertEquals(new Solution().longestPalindrome("ab"), "a");

        Assertions.assertEquals(new Solution().longestPalindrome("abaaba"), "abaaba");
        Assertions.assertEquals(new Solution().longestPalindrome("ababaa"), "ababa");
        Assertions.assertEquals(new Solution().longestPalindrome("abababa"), "abababa");
        Assertions.assertEquals(new Solution().longestPalindrome("1abcbcba"), "abcbcba");

    }

}
