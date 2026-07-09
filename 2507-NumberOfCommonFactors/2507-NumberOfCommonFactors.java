// Last updated: 7/9/2026, 9:52:36 AM
class Solution {
    public int commonFactors(int a, int b) {
        int count=0;
        int min_num = Math.min(a, b);
        for (int i = 1; i <= min_num; i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }
        
        return count;
    }
}
    