package easy._1356;

/**
 * @author zhizhao.zhang
 * @date 2020/11/06
 */
class Solution {
    private static final int[] v = new int[10005];

    static {
        for (int i = 0; i < v.length; i++) {
            v[i] = Integer.bitCount(i);
        }
    }

    public int[] sortByBits(int[] arr) {
        sort(arr, 0, arr.length - 1);
        return arr;
    }

    private void sort(int[] arr, int l, int r) {
        if (l < r) {
            int flag = partition(arr, l, r);
            sort(arr, l, flag - 1);
            sort(arr, flag + 1, r);
        }
    }

    private int partition(int[] arr, int l, int r) {
        int index = l + 1;
        for (int i = index; i <= r; i++) {
            if (compare(arr[i], arr[l])) {
                swap(arr, i, index);
                index++;
            }
        }
        swap(arr, l, index - 1);
        return index - 1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private boolean compare(int x, int y) {
        if (v[x] != v[y]) {
            return v[x] < v[y];
        }
        return x < y;
    }

}
