package hard._514;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhizhao.zhang
 * @date 2020/11/11
 */
public class TestRunner {
    @Test
    public void t1() {
        Assertions.assertEquals(4, new Solution(true).findRotateSteps("godding", "gd"));
    }

    @Test
    public void t2() {
        Assertions.assertEquals(10, new Solution(true).findRotateSteps("abcba", "baca"));
    }

    @Test
    public void t3() {
        Assertions.assertEquals(137, new Solution(true).findRotateSteps("caotmcaataijjxi", "oatjiioicitatajtijciocjcaaxaaatmctxamacaamjjx"));
    }
}
