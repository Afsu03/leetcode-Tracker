// Last updated: 7/9/2026, 9:52:58 AM
class Solution {
    public int subtractProductAndSum(int n) {
      int product = 1;
        int sum = 0;
        int digit;  // declare outside loop

        while (n > 0) {
            digit = n % 10;
            product = product * digit;
            sum = sum + digit;
            n = n / 10;
        }

        return product - sum;
    }
}