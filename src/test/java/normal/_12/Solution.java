package normal._12;

/**
 * <a>https://leetcode-cn.com/problems/integer-to-roman/</a>
 *
 * @author zhizhao.zhang
 * @date 2020/08/10
 */
class Solution {
    private final char[][] ge = new char[10][];
    private final char[][] shi = new char[10][];
    private final char[][] bai = new char[10][];
    private final char[][] qian = new char[10][];

    {
        ge[0] = new char[0];
        ge[1] = new char[]{'I'};
        ge[2] = new char[]{'I', 'I'};
        ge[3] = new char[]{'I', 'I', 'I'};
        ge[4] = new char[]{'I', 'V'};
        ge[5] = new char[]{'V'};
        ge[6] = new char[]{'V', 'I'};
        ge[7] = new char[]{'V', 'I', 'I'};
        ge[8] = new char[]{'V', 'I', 'I', 'I'};
        ge[9] = new char[]{'I', 'X'};

        shi[0] = new char[0];
        shi[1] = new char[]{'X'};
        shi[2] = new char[]{'X', 'X'};
        shi[3] = new char[]{'X', 'X', 'X'};
        shi[4] = new char[]{'X', 'L'};
        shi[5] = new char[]{'L'};
        shi[6] = new char[]{'L', 'X'};
        shi[7] = new char[]{'L', 'X', 'X'};
        shi[8] = new char[]{'L', 'X', 'X', 'X'};
        shi[9] = new char[]{'X', 'C'};

        bai[0] = new char[0];
        bai[1] = new char[]{'C'};
        bai[2] = new char[]{'C', 'C'};
        bai[3] = new char[]{'C', 'C', 'C'};
        bai[4] = new char[]{'C', 'D'};
        bai[5] = new char[]{'D'};
        bai[6] = new char[]{'D', 'C'};
        bai[7] = new char[]{'D', 'C', 'C'};
        bai[8] = new char[]{'D', 'C', 'C', 'C'};
        bai[9] = new char[]{'C', 'M'};

        qian[0] = new char[0];
        qian[1] = new char[]{'M'};
        qian[2] = new char[]{'M', 'M'};
        qian[3] = new char[]{'M', 'M', 'M'};
    }

    public String intToRoman(int num) {
        char[] re = new char[1000];
        int ans = re.length, x;

        //个
        x = num % 10;
        num /= 10;
        char[] c = ge[x];
        ans -= c.length;
        System.arraycopy(ge[x], 0, re, ans, ge[x].length);
        if (num == 0) {
            return new String(re, ans, re.length - ans);
        }

        //十
        x = num % 10;
        num /= 10;
        c = shi[x];
        ans -= c.length;
        System.arraycopy(shi[x], 0, re, ans, shi[x].length);
        if (num == 0) {
            return new String(re, ans, re.length - ans);
        }

        //百
        x = num % 10;
        num /= 10;
        c = bai[x];
        ans -= c.length;
        System.arraycopy(bai[x], 0, re, ans, bai[x].length);
        if (num == 0) {
            return new String(re, ans, re.length - ans);
        }

        //千
        x = num % 10;
        num /= 10;
        c = qian[x];
        ans -= c.length;
        System.arraycopy(qian[x], 0, re, ans, qian[x].length);
        return new String(re, ans, re.length - ans);

    }
}

