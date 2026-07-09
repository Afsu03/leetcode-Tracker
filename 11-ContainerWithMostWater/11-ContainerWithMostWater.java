// Last updated: 7/9/2026, 9:55:19 AM
class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int maxArea = 0;

        while(left < right){

            int width = right - left;

            int currentArea =
                width * Math.min(height[left], height[right]);

            maxArea = Math.max(maxArea, currentArea);

            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}