// Last updated: 7/9/2026, 9:55:01 AM
class Solution {
    public int strStr(String haystack, String needle) {
       for(int i=0;i<haystack.length()-needle.length()+1;i++){
        if(haystack.charAt(i)==needle.charAt(0)){
            if(haystack.substring(i,needle.length()+i).equals(needle)){
                return i;
            }    
        }
       } 
      return -1;
    }
}