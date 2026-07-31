// Last updated: 7/31/2026, 9:04:52 AM
import java.util.*;

class Solution {
    public String largestNumber(int[] nums) {

        // Step 1: Convert int[] into String[]
        String[] arr = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

       
        Arrays.sort(arr, (a, b) -> {


            String first = a + b;
            String second = b + a;

          
            return second.compareTo(first);
        });

        if (arr[0].equals("0")) {
            return "0";
        }

        String answer = "";

        for (String number : arr) {
            answer = answer + number;
        }

        return answer;
    }
}