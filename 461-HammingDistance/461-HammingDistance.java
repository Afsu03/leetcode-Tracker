// Last updated: 7/9/2026, 9:53:16 AM
class Solution {
    public int hammingDistance(int x, int y) {
         int xor = x ^ y; // bits that are different
        int count = 0;
        while (xor != 0) {
            count++;
            xor &= (xor - 1); // clear the lowest set bit
        }
        return count;
    }
}