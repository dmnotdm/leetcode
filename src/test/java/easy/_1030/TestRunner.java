package easy._1030;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhizhao.zhang
 * @date 2020/11/17
 */
public class TestRunner {
    @Test
    public void t0() {
        int[][] ints = new Solution().allCellsDistOrder(1, 1, 0, 0);
        int[][] re = new int[][]{{0, 0}};
        Assertions.assertArrayEquals(re, ints);
    }

    @Test
    public void t1() {
        int[][] ints = new Solution().allCellsDistOrder(1, 2, 0, 0);
        int[][] re = new int[][]{{0, 0}, {0, 1}};
        Assertions.assertArrayEquals(re, ints);
    }

    @Test
    public void t2() {
        int[][] ints = new Solution().allCellsDistOrder(2, 2, 0, 1);
        int[][] re = new int[][]{{0, 1}, {1, 1}, {0, 0}, {1, 0}};
        Assertions.assertArrayEquals(re, ints);
    }

    @Test
    public void t3() {
        int[][] ints = new Solution().allCellsDistOrder(2, 3, 1, 2);
        int[][] re = new int[][]{{1, 2}, {0, 2}, {1, 1}, {1, 0}, {0, 1}, {0, 0}};
        Assertions.assertArrayEquals(re, ints);
    }
}
