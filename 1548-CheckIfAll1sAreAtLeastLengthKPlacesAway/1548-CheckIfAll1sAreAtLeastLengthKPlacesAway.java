// Last updated: 7/9/2026, 9:52:54 AM
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int prev=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                if(prev != -1 && i- prev - 1<k){
                    return false;
                }
                prev=i;
            }
        }
        return true;
    }
}