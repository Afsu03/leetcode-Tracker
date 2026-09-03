// Last updated: 9/3/2026, 1:51:08 PM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
      HashMap<Integer, Integer>map = new HashMap<>();
      for(int num : arr){
        map.put(num, map.getOrDefault(num, 0)+1);
      }
      HashSet<Integer>set = new HashSet<>();
      for(int count : map.values()){
        if(set.contains(count)){
            return false;
        }
        set.add(count);
      }
      return true;
    }
}