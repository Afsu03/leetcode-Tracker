// Last updated: 7/9/2026, 9:53:34 AM
class Solution {
    public boolean isAnagram(String s1, String s2) {
    int dp[]= new int[26];
      for(int i=0;i<s1.length();i++){
     dp[s1.charAt(i)-'a']++;
      }  
      for(int i=0;i<s2.length();i++){
    dp[s2.charAt(i)-'a']--;
      }
    for(int i=0;i<26;i++){
         if(dp[i]!=0){
            return false;
        }
    }
    return  true;
    }
}