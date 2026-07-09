// Last updated: 7/9/2026, 9:52:46 AM
class Solution {
    public int minPartitions(String n) {
        int maxdg=0;

        for(int i=0;i<n.length();i++){
            int digit=n.charAt(i)-'0';
            maxdg=Math.max(maxdg,digit);
        }
        return maxdg;
    }
}