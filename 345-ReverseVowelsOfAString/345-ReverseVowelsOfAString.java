// Last updated: 7/31/2026, 9:03:58 AM
class Solution {

    public String reverseVowels(String s) {

        char[] a = s.toCharArray();

        int left = 0;
        int right = a.length - 1;

        while (left < right) {

            // Move left pointer until a vowel is found
            while (left < right && !isVowel(a[left])) {
                left++;
            }

            // Move right pointer until a vowel is found
            while (left < right && !isVowel(a[right])) {
                right--;
            }

            // Swap the vowels
            char temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            // Move both pointers
            left++;
            right--;
        }

        return new String(a);
    }

    public boolean isVowel(char ch) {

        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' ||
               ch == 'O' || ch == 'U';
    }
}