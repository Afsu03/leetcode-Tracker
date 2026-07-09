// Last updated: 7/9/2026, 9:53:44 AM
class Solution {
    public int hammingWeight(int n) {
         int count = 0;
        while (n != 0) {
            count++;
            n &= (n - 1); 
        }
        return count;
    }
}