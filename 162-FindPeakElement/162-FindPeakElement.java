// Last updated: 7/9/2026, 9:54:01 AM
class Solution {
    public int findPeakElement(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return i;
            }
        }
        return nums.length -1;
    }
}