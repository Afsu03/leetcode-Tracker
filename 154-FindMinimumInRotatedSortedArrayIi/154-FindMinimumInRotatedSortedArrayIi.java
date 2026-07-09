// Last updated: 7/9/2026, 9:54:03 AM
class Solution {
    public int findMin(int[] nums) {
       int min = nums[0];
       for(int i=1;i<nums.length;i++){
        if(nums[i] < min){
            min = nums[i];
        }
       }
       return min;
    }
}