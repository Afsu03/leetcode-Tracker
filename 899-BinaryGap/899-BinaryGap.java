// Last updated: 7/9/2026, 9:53:07 AM
class Solution {
    public int binaryGap(int n) {
        int res = 0, d = -32;
while (n > 0) {
    if (n % 2 == 1) {
       res = Math.max(res, d);
       d = 0;
    }
    n /= 2;
    d++;
}
return res;

    }
}