// Last updated: 7/9/2026, 9:53:32 AM
class Solution {
    public int addDigits(int n){
      if(n==0){
       return 0;
     }
       if(n%9==0){
        return 9;
      }else{
        return n%9;
      }
    }
}