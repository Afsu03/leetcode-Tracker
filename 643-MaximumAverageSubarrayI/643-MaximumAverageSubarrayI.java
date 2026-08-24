// Last updated: 8/24/2026, 2:42:57 PM
class Solution {
    public double findMaxAverage(int[] nums, int k) {

        // Step 1: Find sum of first window
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        // Step 2: Slide the window
        for (int i = k; i < nums.length; i++) {

            windowSum = windowSum 
                        - nums[i - k] 
                        + nums[i];

            maxSum = Math.max(maxSum, windowSum);
        }

        // Step 3: Find average
        return (double) maxSum / k;
    }
}