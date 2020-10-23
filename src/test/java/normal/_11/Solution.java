package normal._11;

/**
 * <a>https://leetcode-cn.com/problems/container-with-most-water/</a>
 *
 * @author zhizhao.zhang
 * @date 2020/08/10
 */
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
