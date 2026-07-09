// Last updated: 7/9/2026, 9:52:23 AM
class Solution {
    public int minOperations(List<Integer> nums, int k) {
      int n=nums.size();
      boolean []isAdded=new boolean[k];
      int count=0;

      for(int i=n-1;i>=0;i--){
        int x=nums.get(i);
        if (x <= k && !isAdded[x - 1]) {
                isAdded[x - 1] = true;
                count++;
                if (count == k) {
                    return n - i;
                }
            }
        }
        return -1;

    }
}
