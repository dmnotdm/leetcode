package hard._23;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhizhao.zhang
 * @date 2020/10/23
 */
public class TestRunner {

    @Test
    public void test() {
        Assertions.assertEquals(string(new Solution().mergeKLists(new ListNode[]{
                parseList("145"), parseList("134"), parseList("26")
        })), "11234456");
        Assertions.assertEquals(string(new Solution().mergeKLists(new ListNode[]{
        })), "");
    }

    private ListNode parseList(String str) {
        char[] chars = str.toCharArray();
        ListNode re = new ListNode(chars[0] - '0');
        ListNode n = re;
        for (int i = 1; i < chars.length; i++) {
            n.next = new ListNode(chars[i] - '0');
            n = n.next;
        }
        return re;
    }

    private String string(ListNode listNode) {
        StringBuilder sb = new StringBuilder();
        while (listNode != null) {
            sb.append(listNode.val);
            listNode = listNode.next;
        }
        return sb.toString();
    }

}
