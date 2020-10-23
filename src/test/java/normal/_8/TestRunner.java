package normal._8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhizhao.zhang
 * @date 2020/10/23
 */
public class TestRunner {

    @Test
    public void test() {
        Assertions.assertEquals(new Solution().myAtoi(""), 0);
        Assertions.assertEquals(new Solution().myAtoi("a"), 0);
        Assertions.assertEquals(new Solution().myAtoi("   -42   "), -42);
        Assertions.assertEquals(new Solution().myAtoi("4193a"), 4193);
        Assertions.assertEquals(new Solution().myAtoi("a42"), 0);
        Assertions.assertEquals(new Solution().myAtoi("-91283472332"), -2147483648);
        Assertions.assertEquals(new Solution().myAtoi("91283472332"), 2147483647);
    }
}
