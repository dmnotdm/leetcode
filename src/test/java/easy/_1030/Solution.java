package easy._1030;

/**
 * @author zhizhao.zhang
 * @date 2020/11/17
 */
class Solution {
    int R;
    int C;
    int r0;
    int c0;
    int ans = 1;
    int[][] re;

    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int len = R * C;
        re = new int[len][];
        re[0] = new int[]{r0, c0};
        this.R = R;
        this.C = C;
        this.r0 = r0;
        this.c0 = c0;

        for (int i = 1; ans < len; i++) {
            w1(i);
            w2(i);
            w3(i);
            w4(i);
        }

        return re;
    }

    private void w1(int step) {
        int r = r0 - step;
        int c = c0;
        if (r < 0) {
            c -= r;
            if (c >= C) {
                return;
            }
            r = 0;
        }
        while (r < r0 && c < C)
            re[ans++] = new int[]{r++, c++};
    }

    private void w2(int step) {
        int c = c0 + step;
        int r = r0;
        if (c >= C) {
            r += c - C + 1;
            if (r >= R) {
                return;
            }
            c = C - 1;
        }
        while (c > c0 && r < R)
            re[ans++] = new int[]{r++, c--};
    }

    private void w3(int step) {
        int r = r0 + step;
        int c = c0;
        if (r >= R) {
            c -= r - R + 1;
            if (c < 0) {
                return;
            }
            r = R - 1;
        }
        while (r > r0 && c >= 0)
            re[ans++] = new int[]{r--, c--};
    }

    private void w4(int step) {
        int c = c0 - step;
        int r = r0;
        if (c < 0) {
            r += c;
            if (r < 0) {
                return;
            }
            c = 0;
        }
        while (c < c0 && r >= 0)
            re[ans++] = new int[]{r--, c++};
    }
}
