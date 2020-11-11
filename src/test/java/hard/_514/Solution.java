package hard._514;

/**
 * @author zhizhao.zhang
 * @date 2020/11/11
 */
class Solution {
    private final boolean test;

    public Solution() {
        test = false;
    }

    public Solution(boolean test) {
        this.test = test;
    }

    public int findRotateSteps(String ring, String key) {
        int[][] dp = new int[key.length()][ring.length()];
        Node[] flag = new Node[30];
        for (int i = 0; i < ring.length(); i++) {
            int ans = ring.charAt(i) - 'a';
            Node node = flag[ans];
            if (node == null) {
                flag[ans] = new Node(i);
                continue;
            }
            while (node.next != null) node = node.next;
            node.link(i);
        }
        int len = key.length() - 1;
        for (int i = 0; i < len; i++) {
            int ans = key.charAt(i) - 'a';
            fixValue(dp, flag[ans], i);
            int step = 0;
            while (true) {
                Node node = flag[ans];
                boolean b = true;
                step++;
                for (; node != null; node = node.next) {
                    b &= write(dp[i], node.i, step);
                }
                if (b) break;
            }
        }
        int re = fixValue(dp, flag[key.charAt(len) - 'a'], len);
        if (test) {
            System.out.print("\t");
            for (int i = 0; i < ring.length(); i++) {
                System.out.print(ring.charAt(i) + "\t");
            }
            System.out.println();
            for (int i = 0, dpLength = dp.length; i < dpLength; i++) {
                System.out.print(key.charAt(i) + "\t");
                for (int j : dp[i]) {
                    System.out.print(j + "\t");
                }
                System.out.println();
            }
        }
        return re;
    }

    private int fixValue(int[][] dp, Node n, int line) {
        int re = Integer.MAX_VALUE;
        for (; n != null; n = n.next) {
            if (line == 0) {
                dp[line][n.i] = Math.min(n.i, Math.abs(dp[line].length - n.i)) + 1;
            } else {
                dp[line][n.i] = dp[line - 1][n.i] + 1;
            }
            if (dp[line][n.i] < re) {
                re = dp[line][n.i];
            }
        }
        return re;
    }

    /**
     * @param step 达成当前格需要步数
     * @return 全部填写结束
     */
    private boolean write(int[] dp, int ans, int step) {
        int l = ans - step;
        int r = ans + step;
        boolean noChange = true;
        if (l < 0) l += dp.length;
        if (r >= dp.length) r -= dp.length;
        step += dp[ans];
        if (dp[l] == 0 || dp[l] > step) {
            dp[l] = step;
            noChange = false;
        }
        if (dp[r] == 0 || dp[r] > step) {
            dp[r] = step;
            noChange = false;
        }
        return noChange;
    }

    private static class Node {
        private final int i;
        private Node next;

        public Node(int i) {
            this.i = i;
        }

        public void link(int ans) {
            next = new Node(ans);
        }

    }
}