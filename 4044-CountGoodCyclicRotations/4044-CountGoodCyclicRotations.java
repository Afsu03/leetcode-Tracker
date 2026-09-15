// Last updated: 9/15/2026, 10:34:47 AM
class Solution {
    public int countGoodRotations(int[] nums) {

        int n = nums.length;
        int half = n / 2;

        long total = 0;

        // Total sum
        for (int num : nums) {
            total += num;
        }

        // Sum of first half
        long windowSum = 0;

        for (int i = 0; i < half; i++) {
            windowSum += nums[i];
        }

        int count = 0;

        // Check every rotation
        for (int start = 0; start < n; start++) {

            if (2 * windowSum > total) {
                count++;
            }

            // Slide the window
            windowSum -= nums[start];
            windowSum += nums[(start + half) % n];
        }

        return count;
    }
}