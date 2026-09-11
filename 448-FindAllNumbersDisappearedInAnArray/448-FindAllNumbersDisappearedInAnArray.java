// Last updated: 9/11/2026, 2:14:22 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }

        for(int i = 1; i <= nums.length; i++) {

            if(!set.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }
}