package normal._767;

/**
 * @author zhizhao.zhang
 * @date 2020/11/30
 */
@SuppressWarnings("all")
class Solution {
    private String EMPTY = "";
    private int[] count = new int[30];

    public String reorganizeString(String s) {
        int max = -1, x, flag = 0;
        for (int i = 0; i < s.length(); i++) {
            x = ++count[s.charAt(i) - 'a'];
            if (x > max) {
                max = x;
                flag = i;
            }
        }
        if (max > (s.length() + 1) / 2) {
            return EMPTY;
        }
        char[] re = new char[s.length()];
        int ans = 0;
        int maxCharIndex = s.charAt(flag) - 'a';
        for (int i = 0; i < s.length(); i += 2) {
            if (count[maxCharIndex] > 0) {
                re[i] = s.charAt(flag);
                count[maxCharIndex]--;
                continue;
            }
            while (count[ans] == 0 || ans == maxCharIndex) ans++;
            re[i] = (char) ('a' + ans);
            count[ans]--;
        }
        for (int i = 1; i < s.length(); i += 2) {
            while (count[ans] == 0) ans++;
            re[i] = (char) ('a' + ans);
            count[ans]--;
        }
        return new String(re);
    }

}
