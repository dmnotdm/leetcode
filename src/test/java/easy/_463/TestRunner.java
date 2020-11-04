package easy._463;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhizhao.zhang
 * @date 2020/10/30
 */
public class TestRunner {
    @Test
    public void test() {
        Assertions.assertEquals(new Solution().islandPerimeter(new int[][]{
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        }), 16);
        Assertions.assertEquals(new Solution().islandPerimeter(new int[][]{
                {0}
        }), 0);
        Assertions.assertEquals(new Solution().islandPerimeter(new int[][]{
                {1}
        }), 4);
        Assertions.assertEquals(new Solution().islandPerimeter(new int[][]{
                {1,1},
                {1,1}
        }), 8);
    }

}
