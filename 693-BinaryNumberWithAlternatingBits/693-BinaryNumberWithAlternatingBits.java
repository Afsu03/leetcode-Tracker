// Last updated: 7/9/2026, 9:53:12 AM
class Solution {
    public boolean hasAlternatingBits(int n) {
         int a=n^(n>>1);
         return(a&(a+1))==0;
    }
}