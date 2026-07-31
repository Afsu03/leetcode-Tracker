// Last updated: 7/31/2026, 9:01:27 AM
class Solution {
    public String mergeAlternately(String w1, String w2) {
        StringBuilder res = new StringBuilder();
        int maxLength = Math.max(w1.length(),w2.length());

        for(int i=0;i<maxLength;i++){
            if(i<w1.length()){
                res.append(w1.charAt(i));
            }
            if(i<w2.length()){
                res.append(w2.charAt(i));
            }
        } 
        return res.toString();
    }
}