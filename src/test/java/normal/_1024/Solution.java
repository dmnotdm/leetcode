package normal._1024;

/**
 * @author zhizhao.zhang
 * @date 2020/10/25
 **/
class Solution {
    private final int[][] re = new int[105][];
    public int videoStitching(int[][] clips, int T) {
        for (int[] clip : clips) {
            int[] old = re[clip[0]];
            if (old == null || old[1] < clip[1]) {
                re[clip[0]] = clip;
            }
        }

        int count = 0;
        //当前是第几段
        int ans = 0;
        //最大时长
        int maxRight = 0;
        //上一段的最大时长
        int lastRight = -1;
        for (; maxRight < T && ans > lastRight;) {
            int[] now = re[ans];
            if (now == null) {
                ans--;
                continue;
            }
            count++;
            //当前轮的角标
            ans = now[1];
            //超过目标了，结束
            if (ans >= T) {
                return count;
            }
            //往左搜到上一轮的最右侧，找最大
            for (;ans > lastRight; ans--) {
                int[] flag = re[ans];
                if (flag == null) {
                    continue;
                }
                if (maxRight < flag[1]) {
                    maxRight = flag[1];
                }
            }
            if (maxRight >= T) {
                return count + 1;
            }
            //记录这一轮的最右侧+1
            lastRight = now[1] + 1;
            //最右侧位置没有超过当前轮，就是没有更靠右的了
            if (maxRight <= lastRight) {
                break;
            }
            //从已找到的最右侧角标开始下一轮
            ans = maxRight;
            count++;
        }
        return -1;
    }
}