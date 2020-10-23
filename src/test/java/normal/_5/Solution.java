package normal._5;

/**
 * <a>https://leetcode-cn.com/problems/longest-palindromic-substring/</a>
 *
 * @author zhizhao.zhang
 * @date 2020/08/07
 */
class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        if (s.length() == 1) {
            return s;
        }

        int l = 0, r = 1, max = 1;
        int sLen = s.length() - 1;
        for (int i = 0; i < sLen; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                int re = find(s, i, i + 1);
                int len = 2 + 2 * re;
                if (len > max) {
                    max = len;
                    l = i - re;
                    r = i + re + 2;
                }
            }

            int re = find(s, i, i);
            int len = 1 + 2 * re;
            if (len > max) {
                max = len;
                l = i - re;
                r = i + re + 1;
            }
        }

        return s.substring(l, r);
    }

    private int find(String s, int ll, int rr) {
        int re = 0;
        while (--ll >= 0 && ++rr < s.length()) {
            if (!(s.charAt(ll) == s.charAt(rr))) {
                return re;
            }
            re++;
        }
        return re;
    }
}
