package normal._127;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhizhao.zhang
 * @date 2020/11/05
 */
public class TestRunner {

    @Test
    public void test() {
        Assertions.assertEquals(5, new Solution().ladderLength("hit", "cog", Arrays.asList("hot","dot","dog","lot","log","cog")));
        Assertions.assertEquals(5, new Solution().ladderLength("hit", "cog", Arrays.asList("hot","dot","cog","dog","lot","log")));
        Assertions.assertEquals(0, new Solution().ladderLength("hit", "cog", Arrays.asList("hot","dot","dog","lot","log")));
    }
}
