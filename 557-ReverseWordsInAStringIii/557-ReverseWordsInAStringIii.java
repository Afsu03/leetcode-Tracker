// Last updated: 8/24/2026, 2:22:38 PM
class Solution {
    public String reverseWords(String s) {
        String[]wd = s.split(" ");
        String res = "";
        for(String w : wd){
            String rev = "";
        
        for(int i=w.length()-1;i>=0;i--){
            rev+=w.charAt(i);
        }
        res += rev + " ";
        }
        return res.trim();
    }
}