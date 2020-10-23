package normal._6;

/**
 * <a>https://leetcode-cn.com/problems/zigzag-conversion/</a>
 *
 * @author zhizhao.zhang
 * @date 2020/08/07
 */
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        boolean[] flag = new boolean[s.length()];
        char[] re = new char[s.length()];
        int ans = 0;
        int l = numRows * 2 - 2;
        //记录第一行第一行
        for (int i = 0; i < s.length(); i += l) {
            flag[i] = true;
            re[ans++] = s.charAt(i);
        }

        int r;
        for (int i = 1; i < numRows; i++) {
            flag[i] = true;
            re[ans++] = s.charAt(i);
            //循环找位置
            for (int j = i + 1; j < s.length(); j++) {
                //当前位已记录，上一位没有记录，记录上一位
                if (flag[j] && !flag[(r = j - 1)]) {
                    flag[r] = true;
                    re[ans++] = s.charAt(r);
                    //搜到结尾或者下一个false的位置
                    while (++j < s.length() && flag[j]) ;
                    //搜到结尾也没找到false，说明莫得了
                    if (j >= s.length()) {
                        break;
                    }
                    //记录当前值，本次循环结束
                    flag[j] = true;
                    re[ans++] = s.charAt(j);
                }
            }
            //结尾判断
            r = s.length() - 1;
            if (!flag[r] && (r + i) % l == 0) {
                flag[r] = true;
                re[ans++] = s.charAt(r);
            }
        }
        return new String(re);
    }
}
