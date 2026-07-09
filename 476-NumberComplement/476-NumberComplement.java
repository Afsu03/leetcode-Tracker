// Last updated: 7/9/2026, 9:53:15 AM
class Solution {
    public int findComplement(int num) {
         int mask = (1 << Integer.toBinaryString(num).length()) - 1; 
        return num ^ mask; 
    }
}