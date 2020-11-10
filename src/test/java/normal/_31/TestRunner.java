package normal._31;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhizhao.zhang
 * @date 2020/11/10
 */
public class TestRunner {
    @Test
    public void t1() {
        int[] nums = {1, 2, 3};
        new Solution().nextPermutation(nums);
        Assertions.assertArrayEquals(new int[]{1, 3, 2}, nums);
    }

    @Test
    public void t2() {
        int[] nums = {3, 2, 1};
        new Solution().nextPermutation(nums);
        Assertions.assertArrayEquals(new int[]{1, 2, 3}, nums);
    }

    @Test
    public void t3() {
        int[] nums = {1, 1, 5};
        new Solution().nextPermutation(nums);
        Assertions.assertArrayEquals(new int[]{1, 5, 1}, nums);
    }

    @Test
    public void t4() {
        int[] nums = {1, 3, 4, 2};
        new Solution().nextPermutation(nums);
        Assertions.assertArrayEquals(new int[]{1, 4, 2, 3}, nums);
    }

    @Test
    public void t5() {
        int[] nums = {1, 4, 3, 2};
        new Solution().nextPermutation(nums);
        Assertions.assertArrayEquals(new int[]{2, 1, 3, 4}, nums);
    }
}
