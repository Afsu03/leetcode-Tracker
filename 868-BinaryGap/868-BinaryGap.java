// Last updated: 9/11/2026, 2:13:26 PM
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