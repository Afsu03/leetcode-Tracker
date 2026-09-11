// Last updated: 9/11/2026, 2:10:17 PM
class Solution {
    public int accountBalanceAfterPurchase(int a) {
        int roundedAmount=(int)Math.round(a/10.0)*10;
        return 100-roundedAmount;
    }
}