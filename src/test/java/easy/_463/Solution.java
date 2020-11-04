package easy._463;

/**
 * @author zhizhao.zhang
 * @date 2020/10/30
 */
class Solution {
    public int islandPerimeter(int[][] grid) {
        if (grid == null) {
            return 0;
        }
        int re = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0) {
                    continue;
                }
                if (i + 1 >= grid.length || grid[i + 1][j] == 0) {
                    re+=2;
                }
                if (j + 1 >= grid[i].length || grid[i][j + 1] == 0) {
                    re+=2;
                }
            }
        }
        return re;
    }
}
