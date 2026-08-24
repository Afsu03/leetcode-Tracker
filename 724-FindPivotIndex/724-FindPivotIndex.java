// Last updated: 8/24/2026, 3:45:55 PM
class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0, left = 0;

        for (int x : nums)
            total += x;

        for (int i = 0; i < nums.length; i++) {
            if (left == total - left - nums[i])
                return i;

            left += nums[i];
        }

        return -1;
    }
}