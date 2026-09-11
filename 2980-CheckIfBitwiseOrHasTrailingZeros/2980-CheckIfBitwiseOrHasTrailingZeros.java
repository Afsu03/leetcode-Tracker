// Last updated: 9/11/2026, 2:10:15 PM
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