// Last updated: 7/9/2026, 9:53:46 AM
class Solution {
    public void rotate(int[] nums, int k) {
      int n=nums.length;
      int[]temp=new int[n];

      for(int i=0;i<n;i++){
        temp[(i+k)%n]=nums[i];
      }
      for(int i=0;i<n;i++){
        nums[i]=temp[i];
      }
    }
}



//     k = k % nums.length;
    //    for(int i=0;i<k;i++){
    //         int last=nums[nums.length-1];
    //         for(int j=nums.length-1;j>0;j--){
    //             nums[j]=nums[j-1];
    //         }
    //         nums[0]=last;
    //     }     