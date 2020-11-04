package normal._144;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhizhao.zhang
 * @date 2020/10/27
 */
public class TestRunner {
    @Test
    public void test() {
        Assertions.assertEquals(parse(new Solution().preorderTraversal(create())), "123");
    }

    private static String parse(List<Integer> list) {
        StringBuilder sb = new StringBuilder(list.size());
        list.forEach(sb::append);
        return sb.toString();
    }

    private static TreeNode create() {
        return new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
    }
}
