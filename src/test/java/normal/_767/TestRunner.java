package normal._767;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhizhao.zhang
 * @date 2020/11/30
 */
public class TestRunner {
    @Test
    public void t1() {
        Assertions.assertEquals(new Solution().reorganizeString("aab"), "aba");
    }

    @Test
    public void t2() {
        Assertions.assertEquals(new Solution().reorganizeString("aaab"), "");
    }

    @Test
    public void t3() {
        Assertions.assertEquals(new Solution().reorganizeString("aabbcc"), "abacbc");
    }

    @Test
    public void t4() {
        Assertions.assertEquals(new Solution().reorganizeString("abcde"), "adbec");
    }
}
