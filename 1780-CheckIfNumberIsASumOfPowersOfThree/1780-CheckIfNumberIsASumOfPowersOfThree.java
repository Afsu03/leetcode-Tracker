// Last updated: 9/11/2026, 2:11:23 PM
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