package easy._7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhizhao.zhang
 * @date 2020/10/23
 */
public class TestRunner {

    @Test
    public void test() {
        Assertions.assertEquals(new Solution().reverse(233), 332);
        Assertions.assertEquals(new Solution().reverse(-233), -332);
        Assertions.assertEquals(new Solution().reverse(-10), -1);
        Assertions.assertEquals(new Solution().reverse(1534236469), 0);
        Assertions.assertEquals(new Solution().reverse(-1534236469), 0);
        Assertions.assertEquals(new Solution().reverse(1463847412), 2147483641);
        Assertions.assertEquals(new Solution().reverse(-1463847412), -2147483641);
    }

}
