// Last updated: 7/9/2026, 9:52:53 AM
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