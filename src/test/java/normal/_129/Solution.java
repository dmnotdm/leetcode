package normal._129;

/**
 * @author zhizhao.zhang
 * @date 2020/10/29
 */
class Solution {
    private int re = 0;

    public int sumNumbers(TreeNode root) {
        if (root != null) {
            calculate(root, 0);
        }
        return re;
    }

    private void calculate(TreeNode node, int now) {
        now += node.val;
        if (isLeaf(node)) {
            re += now;
            return;
        }
        now *= 10;
        if (node.left != null) {
            calculate(node.left, now);
        }
        if (node.right != null) {
            calculate(node.right, now);
        }
    }

    private boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }
}
