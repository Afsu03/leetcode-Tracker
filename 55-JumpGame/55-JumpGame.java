// Last updated: 7/9/2026, 9:54:29 AM
class Solution {
    public boolean canJump(int[] nums) {
        int lastPos=nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i]>=lastPos){
                lastPos=i;
            }
        }
        return lastPos==0;
    }
}