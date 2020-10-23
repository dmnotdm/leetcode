package hard._30;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author zhizhao.zhang
 * @date 2020/10/23
 */
class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> re = new LinkedList<>();
        //字典
        Map<String, Integer> dic = new HashMap<>(words.length);
        for (String word : words) {
            dic.merge(word, 1, Integer::sum);
        }
        //单个单词长度
        int wordLen = words[0].length();
        //拼接单词总长度
        int len = wordLen * words.length;
        //遍历的结尾角标
        int rightAns = s.length() - len;
        if (rightAns < 0) {
            return re;
        }
        int j, z;
        for (int i = 0; i <= rightAns; i++) {
            z = i;
            Map<String, Integer> copyMap = new HashMap<>(dic);
            for (j = 0; j < words.length; j++, z += wordLen) {
                String key = s.substring(z, z + wordLen);
                Integer ans = copyMap.computeIfPresent(key, (k, v) -> v == 0 ? null : v - 1);
                if (ans == null) {
                    break;
                }
            }
            if (j == words.length) {
                re.add(i);
            }
        }
        return re;
    }
}