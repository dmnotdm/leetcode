package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * <a>https://leetcode-cn.com/problems/reverse-integer/</a>
 *
 * @author zhizhao.zhang
 * @date 2020/08/07
 */
public class _7 {

    @Test
    public void test() {
        Assertions.assertEquals(new Solution().reverse(233), 332);
        Assertions.assertEquals(new Solution().reverse(-233), -332);
        Assertions.assertEquals(new Solution().reverse(-10), -1);
        Assertions.assertEquals(new Solution().reverse(1534236469), 0);
        Assertions.assertEquals(new Solution().reverse(-1534236469), 0);
        Assertions.assertEquals(new Solution().reverse(1463847412), 2147483641);
        Assertions.assertEquals(new Solution().reverse(-1463847412), -2147483641);
    }

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
}
