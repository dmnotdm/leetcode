package normal._973;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhizhao.zhang
 * @date 2020/11/09
 */
public class TestRunner {
    @Test
    public void test() {
        Assertions.assertArrayEquals(new int[][]{{-2, 2}}, new Solution().kClosest(new int[][]{{1, 3}, {-2, 2}}, 1));
        Assertions.assertArrayEquals(new int[][]{{3, 3}, {-2, 4}}, new Solution().kClosest(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2));
    }
}
