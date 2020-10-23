package easy._7;

/**
 * <a>https://leetcode-cn.com/problems/reverse-integer/</a>
 *
 * @author zhizhao.zhang
 * @date 2020/08/07
 */
class Solution {
    public int reverse(int x) {
        int re = 0;
        int i = 0;
        boolean isNegative = x >>> 31 == 1;
        int flag = (isNegative ? 0x80000000 : 0x7fffffff) / 10;
        while (x != 0) {
            ++i;
            if (i == 10) {
                if (isNegative) {
                    if (re < flag) {
                        return 0;
                    }
                } else {
                    if (re > flag) {
                        return 0;
                    }
                }
            }
            re = re * 10 + x % 10;
            x /= 10;
        }
        return re;
    }
}
