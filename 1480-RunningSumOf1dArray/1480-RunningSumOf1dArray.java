// Last updated: 9/11/2026, 2:12:01 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int[] result=new int[nums.length];
        int runningtotal=0;

        for(int i=0;i<nums.length;i++){
          runningtotal += nums[i];
          result[i] = runningtotal;
        }
        return result;
    }
}