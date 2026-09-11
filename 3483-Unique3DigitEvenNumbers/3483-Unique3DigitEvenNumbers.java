// Last updated: 9/11/2026, 2:10:14 PM
class Solution {
    public int totalNumbers(int[] digits) {

        int[] freq = new int[10];

        // Count how many times each digit appears
        for (int digit : digits) {
            freq[digit]++;
        }

        int count = 0;

        // Hundreds digit
        for (int i = 1; i <= 9; i++) {

            if (freq[i] == 0) {
                continue;
            }

            // Use i
            freq[i]--;

            // Tens digit
            for (int j = 0; j <= 9; j++) {

                if (freq[j] == 0) {
                    continue;
                }

                // Use j
                freq[j]--;

                // Ones digit must be even
                for (int k = 0; k <= 8; k += 2) {

                    if (freq[k] > 0) {
                        count++;
                    }
                }

                // Put j back
                freq[j]++;
            }

            // Put i back
            freq[i]++;
        }

        return count;
    }
}