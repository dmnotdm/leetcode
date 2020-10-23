package normal._11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhizhao.zhang
 * @date 2020/10/23
 */
public class TestRunner {

    @Test
    public void test() {
        Assertions.assertEquals(new Solution().maxArea(new int[]{1, 2}), 1);
        Assertions.assertEquals(new Solution().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}), 49);
    }

}
