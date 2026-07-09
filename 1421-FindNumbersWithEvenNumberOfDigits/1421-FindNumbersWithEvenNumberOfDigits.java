// Last updated: 7/9/2026, 9:52:57 AM
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num : nums){
            if(String.valueOf(num).length()% 2==0){
                count++;
            }
        }
        return count;
    }
}