// Last updated: 9/11/2026, 2:10:12 PM
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
