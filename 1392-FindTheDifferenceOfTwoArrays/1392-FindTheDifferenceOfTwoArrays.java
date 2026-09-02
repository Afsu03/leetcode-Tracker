// Last updated: 9/2/2026, 10:11:10 AM
import java.util.*;

class Solution {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        // Stores elements that are in nums1
        // but NOT in nums2
        List<Integer> first = new ArrayList<>();

        // Stores elements that are in nums2
        // but NOT in nums1
        List<Integer> sec = new ArrayList<>();


        // ---------- Check nums1 ----------
        for (int i = 0; i < nums1.length; i++) {

            boolean found = false;

            // Check nums1[i] with every element of nums2
            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {
                    found = true;
                    break;
                }
            }

            // If nums1[i] is NOT present in nums2
            // AND it is not already added
            if (found == false && !first.contains(nums1[i])) {
                first.add(nums1[i]);
            }
        }


        // ---------- Check nums2 ----------
        for (int i = 0; i < nums2.length; i++) {

            boolean found = false;

            // Check nums2[i] with every element of nums1
            for (int j = 0; j < nums1.length; j++) {

                if (nums2[i] == nums1[j]) {
                    found = true;
                    break;
                }
            }

            // If nums2[i] is NOT present in nums1
            // AND it is not already added
            if (found == false && !sec.contains(nums2[i])) {
                sec.add(nums2[i]);
            }
        }


        // ---------- Create final answer ----------
        List<List<Integer>> ans = new ArrayList<>();

        ans.add(first);
        ans.add(sec);

        return ans;
    }
}