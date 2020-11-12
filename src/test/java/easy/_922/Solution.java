package easy._922;

/**
 * @author zhizhao.zhang
 * @date 2020/11/12
 */
class Solution {
    public int[] sortArrayByParityII(int[] A) {
        if (A == null || A.length < 2) {
            return A;
        }
        int len = A.length / 2;
        int[] a = new int[len];
        int[] b = new int[len];
        int i = 0, j = 0;
        for (int x : A) {
            if (x % 2 == 0) {
                a[i++] = x;
            } else {
                b[j++] = x;
            }
        }
        i = 0;
        for (int k = 0; k < len; k++) {
            A[i++] = a[k];
            A[i++] = b[k];
        }
        return A;
    }
}
