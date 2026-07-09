// Last updated: 7/9/2026, 9:54:26 AM
class Solution {
    public int lengthOfLastWord(String s) {
        String str=s.trim();
        int count=0;

        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}