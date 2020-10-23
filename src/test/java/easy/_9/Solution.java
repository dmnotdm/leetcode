package easy._9;

/**
 * <a>https://leetcode-cn.com/problems/palindrome-number/</a>
 *
 * @author zhizhao.zhang
 * @date 2020/08/10
 */
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        int y = 0, n = x;
        while (x > 0) {
            y = y * 10 + x % 10;
            x /= 10;
        }
        return n == y;
    }
}
