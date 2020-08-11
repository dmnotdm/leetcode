package hard;

import java.util.Comparator;
import java.util.PriorityQueue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * <a>https://leetcode-cn.com/problems/merge-k-sorted-lists/</a>
 * @author zhizhao.zhang
 * @date 2020/08/10
 */
public class _23 {

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

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            if (lists.length == 1) {
                return lists[0];
            }
            ListNode re;
            PriorityQueue<ListNode> queue = new PriorityQueue<>(Comparator.comparingInt(it -> it.val));
            for (ListNode list : lists) {
                if (list != null) {
                    queue.add(list);
                }
            }
            re = new ListNode(0);
            ListNode n = re;
            while (!queue.isEmpty()) {
                ListNode p = queue.poll();
                if (p.next != null) {
                    queue.add(p.next);
                }
                n.next = p;
                n = n.next;
            }
            n.next = null;
            return re.next;
        }
    }

}
