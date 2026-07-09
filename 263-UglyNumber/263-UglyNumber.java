// Last updated: 7/9/2026, 9:53:31 AM
class Solution {
    public boolean isUgly(int n) {
     if (n <= 0) return false;
         for (int factor : new int[]{2, 3, 5}) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        return n == 1;
    }
}