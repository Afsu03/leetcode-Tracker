// Last updated: 9/11/2026, 2:11:07 PM
class Solution {
    public boolean isSameAfterReversals(int num) {
     if(num==0)
     return true;
     return !(num%10==0);
      
   }
}