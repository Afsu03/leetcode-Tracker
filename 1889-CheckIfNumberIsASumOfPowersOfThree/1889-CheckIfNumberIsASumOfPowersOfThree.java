// Last updated: 7/9/2026, 9:52:44 AM
class Solution {
    public boolean checkPowersOfThree(int n) {
        while(n>0){
            if(n%3>1){
                return false;
            }
            n/=3;
        }
        return true;
    }
}