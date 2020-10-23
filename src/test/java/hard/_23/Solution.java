package hard._23;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * <a>https://leetcode-cn.com/problems/merge-k-sorted-lists/</a>
 *
 * @author zhizhao.zhang
 * @date 2020/08/10
 */
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

