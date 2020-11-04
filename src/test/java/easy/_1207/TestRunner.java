package easy._1207;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhizhao.zhang
 * @date 2020/10/28
 */
public class TestRunner {
    @Test
    public void test() {
        Assertions.assertTrue(new Solution().uniqueOccurrences(new int[]{0}));
        Assertions.assertTrue(new Solution().uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
        Assertions.assertTrue(new Solution().uniqueOccurrences(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0}));
        Assertions.assertFalse(new Solution().uniqueOccurrences(new int[]{1, 2}));
    }
}
