// Last updated: 7/9/2026, 9:52:32 AM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
     
        if (k <= numOnes) {
            return k;
        } else if (k <= numOnes + numZeros) {
            return numOnes;
        } else {
            return numOnes - (k - numOnes - numZeros);
        }
    }
}