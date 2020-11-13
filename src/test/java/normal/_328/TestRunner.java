package normal._328;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhizhao.zhang
 * @date 2020/11/13
 */
public class TestRunner {
    @Test
    public void t1() {
        Assertions.assertEquals("13524", print(new Solution().oddEvenList(create("12345"))));
    }

    @Test
    public void t2() {
        Assertions.assertEquals("2367154", print(new Solution().oddEvenList(create("2135647"))));
    }

    @Test
    public void t3() {
        Assertions.assertEquals("12", print(new Solution().oddEvenList(create("12"))));
    }

    private ListNode create(String s) {
        ListNode p = new ListNode();
        ListNode re = p;
        for (int i = 0; i < s.length(); i++) {
            p.next = new ListNode(s.charAt(i) - '0');
            p = p.next;
        }
        return re.next;
    }

    private String print(ListNode p) {
        StringBuilder sb = new StringBuilder();
        for (; p != null; p = p.next) {
            sb.append(p.val);
        }
        return sb.toString();
    }
}
