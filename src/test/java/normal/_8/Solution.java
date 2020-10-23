package normal._8;

/**
 * <a>https://leetcode-cn.com/problems/string-to-integer-atoi/</a>
 *
 * @author zhizhao.zhang
 * @date 2020/08/07
 */

class Solution {
    public int myAtoi(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        int ans = 0;
        for (; ans < str.length() && str.charAt(ans) == ' '; ans++) ;
        if (ans == str.length()) {
            return 0;
        }

        char c = str.charAt(ans);
        if (c != '-' && c != '+' && !isNumber(c)) {
            return 0;
        }

        boolean isNegative = str.charAt(ans) == '-';
        if (c == '-' || c == '+') {
            ans++;
        }
        if (ans == str.length()) {
            return 0;
        }

        long re = 0;
        int len = 0;
        for (; ans < str.length(); ans++) {
            c = str.charAt(ans);
            if (!isNumber(c)) {
                break;
            }
            re = re * 10 + c - '0';
            if (isNegative) {
                if (-re <= Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
            } else {
                if (re >= Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
            }
            len++;
        }

        if (len == 0) {
            return 0;
        }

        return (int) (isNegative ? -re : re);
    }

    private boolean isNumber(char c) {
        return c >= '0' && c <= '9';
    }
}
