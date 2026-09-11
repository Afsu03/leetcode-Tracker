// Last updated: 9/11/2026, 2:20:25 PM
class Solution {
    public int smallestNumber(int n) {
     int x = 1;
        while (x - 1 < n) {
            x <<= 1; // multiply by 2
        }
        return x - 1;
    }
}
