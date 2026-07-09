// Last updated: 7/9/2026, 9:52:20 AM
class Solution {
    public int smallestNumber(int n) {
     int x = 1;
        while (x - 1 < n) {
            x <<= 1; // multiply by 2
        }
        return x - 1;
    }
}
