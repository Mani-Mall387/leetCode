class Solution {

    public static int binary(int[] nums, int low,
                             int high, int target) {

        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (nums[mid] == target) {
            return mid;
        }

        if (nums[mid] > target) {
            return binary(nums, low, mid - 1, target);
        }

        return binary(nums, mid + 1, high, target);
    }

    public int search(int[] nums, int target) {

        int high = nums.length - 1;

        return binary(nums, 0, high, target);
    }
}