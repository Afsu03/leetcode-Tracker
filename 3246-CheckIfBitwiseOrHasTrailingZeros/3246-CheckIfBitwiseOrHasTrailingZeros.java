// Last updated: 7/9/2026, 9:52:26 AM
class Solution {
    public boolean hasTrailingZeros(int[] nums) {
      int count=0;
      for(int num:nums){
        if((num & 1)==0){
            count++;
        }
        if(count>1){
            count--;
            return true;
        }
      }
      return false;
    }
}