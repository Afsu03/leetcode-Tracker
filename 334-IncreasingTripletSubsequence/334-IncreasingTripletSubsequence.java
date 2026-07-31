// Last updated: 7/31/2026, 9:04:01 AM
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int num : nums){
            if(num <= first){
                first=num;
            }else if(num<=second){
                second = num;
            }else{
                return true;
            }
        }
        return false;
    }
}