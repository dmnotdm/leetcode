package normal._6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhizhao.zhang
 * @date 2020/10/23
 */
public class TestRunner {
    @Test
    public void test() {
        Assertions.assertEquals(new Solution().convert("A", 1), "A");
        Assertions.assertEquals(new Solution().convert("0123456", 1), "0123456");
        Assertions.assertEquals(new Solution().convert("0123456", 2), "0246135");
        Assertions.assertEquals(new Solution().convert("LEETCODEISHIRING", 3), "LCIRETOESIIGEDHN");
        Assertions.assertEquals(new Solution().convert("LEETCODEISHIRING", 4), "LDREOEIIECIHNTSG");
        Assertions.assertEquals(new Solution().convert("01234567", 3), "04135726");
        Assertions.assertEquals(new Solution().convert("0123456", 4), "0615243");
    }
}
