package hard._30;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * <a>https://leetcode-cn.com/problems/substring-with-concatenation-of-all-words/</a>
 * 给定一个字符串 s 和一些长度相同的单词 words。找出 s 中恰好可以由 words 中所有单词串联形成的子串的起始位置。
 * <p>
 * 注意子串要与 words 中的单词完全匹配，中间不能有其他字符，但不需要考虑 words 中单词串联的顺序。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：
 * s = "barfoothefoobarman",
 * words = ["foo","bar"]
 * 输出：[0,9]
 * 解释：
 * 从索引 0 和 9 开始的子串分别是 "barfoo" 和 "foobar" 。
 * 输出的顺序不重要, [9,0] 也是有效答案。
 * 示例 2：
 * <p>
 * 输入：
 * s = "wordgoodgoodgoodbestword",
 * words = ["word","good","best","word"]
 * 输出：[]
 *
 * @author zhizhao.zhang
 * @date 2020/10/23
 */
public class TestRunner {
    @Test
    public void test() {
        assertEquals(new Solution().findSubstring("barfoothefoobarman", new String[]{"foo", "bar"}).toString(), "[0, 9]");
        assertEquals(new Solution().findSubstring("wordgoodgoodgoodbestword", new String[]{"word", "good", "best", "word"}).toString(), "[]");
        assertEquals(new Solution().findSubstring("aaaaa", new String[]{"a"}).toString(), "[0, 1, 2, 3, 4]");
        assertEquals(new Solution().findSubstring("abba", new String[]{"a", "b"}).toString(), "[0, 2]");
        assertEquals(new Solution().findSubstring("aaaa", new String[]{"a", "a"}).toString(), "[0, 1, 2]");
    }
}
