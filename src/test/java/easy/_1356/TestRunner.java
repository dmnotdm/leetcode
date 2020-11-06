package easy._1356;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhizhao.zhang
 * @date 2020/11/06
 */
public class TestRunner {
    @Test
    public void t1() {
        Assertions.assertArrayEquals(new int[]{0, 1, 2, 4, 8, 3, 5, 6, 7}, new Solution().sortByBits(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}));
    }

    @Test
    public void t2() {
        Assertions.assertArrayEquals(new int[]{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024}, new Solution().sortByBits(new int[]{1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1}));
    }

    @Test
    public void t3() {
        Assertions.assertArrayEquals(new int[]{10000, 10000}, new Solution().sortByBits(new int[]{10000, 10000}));
    }

    @Test
    public void t4() {
        Assertions.assertArrayEquals(new int[]{2, 3, 5, 17, 7, 11, 13, 19}, new Solution().sortByBits(new int[]{2, 3, 5, 7, 11, 13, 17, 19}));
    }

    @Test
    public void t5() {
        Assertions.assertArrayEquals(new int[]{10, 100, 10000, 1000}, new Solution().sortByBits(new int[]{10, 100, 1000, 10000}));
    }
}
