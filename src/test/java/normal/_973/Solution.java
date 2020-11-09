package normal._973;

import java.util.stream.Stream;

/**
 * @author zhizhao.zhang
 * @date 2020/11/09
 */
class Solution {
    public int[][] kClosest(int[][] points, int K) {
        int[][] re = new int[K][];
        X ans = new X();
        Stream.of(points).sorted((o1, o2) -> {
            int a = o1[0] * o1[0] + o1[1] * o1[1];
            int b = o2[0] * o2[0] + o2[1] * o2[1];
            return a - b;
        }).limit(K).forEach(x -> {
            re[ans.ans] = new int[2];
            re[ans.ans][0] = x[0];
            re[ans.ans][1] = x[1];
            ans.ans++;
        });
        return re;
    }

    private static class X {
        int ans = 0;
    }
}
