// Last updated: 9/11/2026, 2:12:38 PM
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