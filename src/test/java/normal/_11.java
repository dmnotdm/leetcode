package normal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * <a>https://leetcode-cn.com/problems/container-with-most-water/</a>
 *
 * @author zhizhao.zhang
 * @date 2020/08/10
 */
public class _11 {

    @Test
    public void test() {
        Assertions.assertEquals(new Solution().maxArea(new int[]{1, 2}), 1);
        Assertions.assertEquals(new Solution().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}), 49);
    }

    class Solution {
        public int maxArea(int[] height) {
            int re = 0, i = 0, j = height.length - 1;
            int x;
            while (j > i) {
                if (height[i] > height[j]) {
                    x = (j - i) * height[j--];
                } else {
                    x = (j - i) * height[i++];
                }
                if (x > re) {
                    re = x;
                }
            }
            return re;
        }
    }
}
