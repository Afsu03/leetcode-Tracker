// Last updated: 7/31/2026, 9:03:02 AM
class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
              int left = i;
              int right = j;

              boolean palindrome = true;

              while(left<right){
                if(s.charAt(left)!=s.charAt(right)){
                    palindrome = false;
                    break;
                }
                left++;
                right--;
              }
              if(palindrome){
                count++;
              }
            }
        }
        return count;
    }
}