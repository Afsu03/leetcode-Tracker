// Last updated: 8/24/2026, 2:44:12 PM
class Solution {
    public int maxSubArray(int[] nums) {

        int sum = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {

            sum = Math.max(nums[i], sum + nums[i]);

            max = Math.max(max, sum);
        }

        return max;
    }
}









// class Solution {
//     public int maxSubArray(int[] nums) {
       
//         int n =nums.length;
//         int max = Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//              int sum = 0 ;
//             for(int j=i;j<n;j++){
//                 sum+=nums[j];
//                 if(sum>max){
//                 max = sum;
//                }
//             }
//         }
        
//         return max;
//     }
// }