package hard._57;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhizhao.zhang
 * @date 2020/11/04
 */
public class TestRunner {
    int[][] intervals = new int[][]{{3, 5}, {8, 11}, {12, 13}};
    Solution solution = new Solution();

    @Test
    public void mergeTail() {
        Assertions.assertArrayEquals(new int[][]{{3, 7}, {8, 11}, {12, 13}}, solution.insert(intervals, new int[]{4, 7}));
    }

    @Test
    public void mergeHead() {
        Assertions.assertArrayEquals(new int[][]{{3, 5}, {6, 11}, {12, 13}}, solution.insert(intervals, new int[]{6, 10}));
    }

    @Test
    public void create() {
        Assertions.assertArrayEquals(new int[][]{{1, 2}}, solution.insert(new int[][]{}, new int[]{1, 2}));
    }

    @Test
    public void overwrite() {
        //头到尾
        Assertions.assertArrayEquals(new int[][]{{1, 20}}, solution.insert(intervals, new int[]{1, 20}));
    }

    @Test
    public void acrossTail() {
        //跨到尾
        Assertions.assertArrayEquals(new int[][]{{3, 5}, {8, 20}}, solution.insert(intervals, new int[]{9, 20}));
    }

    @Test
    public void acrossHead() {
        //从头跨
        Assertions.assertArrayEquals(new int[][]{{1, 13}}, solution.insert(intervals, new int[]{1, 12}));
    }

    @Test
    public void acrossTwo() {
        //跨两个
        Assertions.assertArrayEquals(new int[][]{{3, 13}}, solution.insert(intervals, new int[]{4, 12}));
    }

    @Test
    public void acrossOne() {
        //跨一个
        Assertions.assertArrayEquals(new int[][]{{3, 11}, {12, 13}}, solution.insert(intervals, new int[]{4, 9}));
    }

    @Test
    public void insertMid() {
        //中间
        Assertions.assertArrayEquals(new int[][]{{3, 5}, {6, 7}, {8, 11}, {12, 13}}, solution.insert(intervals, new int[]{6, 7}));
    }

    @Test
    public void insertTail() {
        //尾
        Assertions.assertArrayEquals(new int[][]{{3, 5}, {8, 11}, {12, 13}, {14, 15}}, solution.insert(intervals, new int[]{14, 15}));
    }

    @Test
    public void insertHead() {
        //头
        Assertions.assertArrayEquals(new int[][]{{1, 2}, {3, 5}, {8, 11}, {12, 13}}, solution.insert(intervals, new int[]{1, 2}));
    }


}
