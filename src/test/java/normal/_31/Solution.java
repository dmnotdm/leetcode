package normal._31;

/**
 * @author zhizhao.zhang
 * @date 2020/11/10
 */
class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        int i = nums.length - 2;
        for (; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                int ans = nums.length - 1;
                int n = Integer.MAX_VALUE;
                for (int j = nums.length - 1; j > i; j--) {
                    if (nums[j] > nums[i] && nums[j] < n) {
                        n = nums[j];
                        ans = j;
                    }
                }
                swap(nums, i, ans);
                break;
            }
        }
        flip(nums, i + 1, nums.length - 1);
    }

    private void flip(int[] nums, int i, int j) {
        for (; i < j; i++, j--) {
            swap(nums, i, j);
        }
    }

    private void swap(int[] nums, int i, int j) {
        nums[i] ^= nums[j];
        nums[j] ^= nums[i];
        nums[i] ^= nums[j];
    }
}
