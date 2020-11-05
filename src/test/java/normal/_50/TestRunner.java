package normal._50;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhizhao.zhang
 * @date 2020/11/05
 */
public class TestRunner {
    @Test
    public void test() {
        Assertions.assertEquals(1024d, parseDouble(new Solution().myPow(2.0d, 10)));
        Assertions.assertEquals(9.26100, parseDouble(new Solution().myPow(2.1d, 3)));
        Assertions.assertEquals(0.25000, parseDouble(new Solution().myPow(2d, -2)));
        Assertions.assertEquals(0, parseDouble(new Solution().myPow(0.00001, 2147483647)));
    }

    private double parseDouble(double d) {
        return new BigDecimal(d).setScale(5, BigDecimal.ROUND_DOWN).doubleValue();
    }
}
