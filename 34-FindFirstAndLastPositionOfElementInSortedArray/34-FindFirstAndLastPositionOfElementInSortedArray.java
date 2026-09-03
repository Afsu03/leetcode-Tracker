// Last updated: 9/3/2026, 2:37:03 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {

        int first = -1;
        int last = -1;

        // Find FIRST position
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                first = mid;
                right = mid - 1;   // move LEFT
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        // Find LAST position
        left = 0;
        right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                last = mid;
                left = mid + 1;    // move RIGHT
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return new int[]{first, last};
    }
}