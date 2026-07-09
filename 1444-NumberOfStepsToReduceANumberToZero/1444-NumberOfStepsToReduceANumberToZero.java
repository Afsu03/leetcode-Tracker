// Last updated: 7/9/2026, 9:52:55 AM
class Solution {
    public int numberOfSteps(int num) {

        int count = 0;
        
        while (num > 0) {
            // Check if the number is even
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                // The number is odd
                num = num - 1;
            }
            count++;
        }
        
        return count;
    }
}
