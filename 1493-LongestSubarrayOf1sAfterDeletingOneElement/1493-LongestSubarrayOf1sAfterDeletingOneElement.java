// Last updated: 9/11/2026, 2:12:05 PM
class Solution {
    public int longestSubarray(int[] nums) {
        int count = 0;
        int i = 0;
        int max = 0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0){
                count++;
            }
        while(count>1){
            if(nums[i]==0){
                count--;
            }
            i++;
        }
        max = Math.max(max,j-i);
        }
        return max;
    }
}