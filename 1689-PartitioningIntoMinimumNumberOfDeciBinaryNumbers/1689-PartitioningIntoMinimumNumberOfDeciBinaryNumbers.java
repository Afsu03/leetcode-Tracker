// Last updated: 9/11/2026, 2:11:31 PM
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