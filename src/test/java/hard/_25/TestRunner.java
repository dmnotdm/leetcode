package hard._25;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhizhao.zhang
 * @date 2020/10/23
 */
public class TestRunner {

    @Test
    public void test() {
        Assertions.assertEquals(parseString(new Solution().reverseKGroup(createList(6), 1)), "123456");
        Assertions.assertEquals(parseString(new Solution().reverseKGroup(createList(6), 2)), "214365");
        Assertions.assertEquals(parseString(new Solution().reverseKGroup(createList(6), 3)), "321654");
        Assertions.assertEquals(parseString(new Solution().reverseKGroup(createList(6), 4)), "432156");
        Assertions.assertEquals(parseString(new Solution().reverseKGroup(createList(6), 6)), "654321");
    }

    private ListNode createList(int len) {
        ListNode h = new ListNode(1);
        ListNode p = h;
        for (int i = 2; i <= len; i++) {
            p.next = new ListNode(i);
            p = p.next;
        }
        return h;
    }

    private String parseString(ListNode p) {
        StringBuilder sb = new StringBuilder(String.valueOf(p.val));
        p = p.next;
        while (p != null) {
            sb.append(p.val);
            p = p.next;
        }
        return sb.toString();
    }

}
