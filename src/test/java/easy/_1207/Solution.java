package easy._1207;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhizhao.zhang
 * @date 2020/10/28
 */
class Solution {
    private final Map<Integer, Integer> countMap = new HashMap<>(2048);
    private final boolean[] re = new boolean[65];

    public boolean uniqueOccurrences(int[] arr) {
        for (int i : arr) {
            countMap.merge(i, 1, Integer::sum);
        }
        return countMap.values().stream().noneMatch(i -> {
            if (re[i]) {
                return true;
            }
            re[i] = true;
            return false;
        });
    }
}
