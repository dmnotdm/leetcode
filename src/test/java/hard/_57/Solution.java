package hard._57;

import java.util.Arrays;

/**
 * @author zhizhao.zhang
 * @date 2020/11/04
 */
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        //防leetcode瞎搞代码
        if ((intervals == null || intervals.length == 0) && newInterval == null) {
            return new int[][]{};
        }
        if (intervals == null || intervals.length == 0) {
            return new int[][]{newInterval};
        }
        int[][] re = new int[intervals.length + 1][];
        int ans = 0, i = 0;
        //小于插入区间的，跳过
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            re[ans++] = intervals[i++];
        }
        //找到覆盖的部分最大最小值
        if (i < intervals.length) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
                i++;
            }
            if (i > 0) {
                newInterval[1] = Math.max(newInterval[1], intervals[i - 1][1]);
            }
        }
        re[ans++] = newInterval;
        //剩下的
        while (i < intervals.length) {
            re[ans++] = intervals[i++];
        }
        return Arrays.copyOf(re, ans);
    }
}
