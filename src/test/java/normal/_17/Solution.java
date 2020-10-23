package normal._17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * <a>https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/</a>
 *
 * @author zhizhao.zhang
 * @date 2020/08/10
 */
class Solution {
    private char[][] chars = new char[][]{
            {},
            {},
            {'a', 'b', 'c'},
            {'d', 'e', 'f'},
            {'g', 'h', 'i'},
            {'j', 'k', 'l'},
            {'m', 'n', 'o'},
            {'p', 'q', 'r', 's'},
            {'t', 'u', 'v'},
            {'w', 'x', 'y', 'z'}
    };

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return new ArrayList<>();
        }
        List<String> re = new LinkedList<>();
        char[] c = new char[1000];
        code(c, 0, digits, re);
        return re;
    }

    private void code(char[] r, int i, String digits, List<String> re) {
        if (i >= digits.length()) {
            re.add(new String(r, 0, i));
            return;
        }
        int ans = digits.charAt(i) - '0';
        for (int j = 0; j < chars[ans].length; j++) {
            r[i] = chars[ans][j];
            code(r, i + 1, digits, re);
        }
    }
}
