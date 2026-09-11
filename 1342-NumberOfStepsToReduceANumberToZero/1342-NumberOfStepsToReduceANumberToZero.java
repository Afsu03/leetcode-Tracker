// Last updated: 9/11/2026, 2:12:29 PM
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
