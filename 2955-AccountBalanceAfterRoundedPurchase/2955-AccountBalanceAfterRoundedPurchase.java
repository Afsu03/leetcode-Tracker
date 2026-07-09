// Last updated: 7/9/2026, 9:52:21 AM
class Solution {
    public int accountBalanceAfterPurchase(int a) {
        int roundedAmount=(int)Math.round(a/10.0)*10;
        return 100-roundedAmount;
    }
}