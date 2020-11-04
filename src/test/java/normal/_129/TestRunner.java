package normal._129;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhizhao.zhang
 * @date 2020/10/29
 */
public class TestRunner {
    @Test
    public void test() {
        Assertions.assertEquals(new Solution().sumNumbers(create0()), 233);
        Assertions.assertEquals(new Solution().sumNumbers(create1()), 1026);
    }

    private TreeNode create0() {
        return new TreeNode(233);
    }

    private TreeNode create1() {
        return new TreeNode(4, new TreeNode(9, new TreeNode(5), new TreeNode(1)), new TreeNode(0));
    }
}
