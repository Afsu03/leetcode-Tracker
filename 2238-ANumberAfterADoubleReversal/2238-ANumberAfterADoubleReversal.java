// Last updated: 7/9/2026, 9:52:40 AM
class Solution {
    public boolean isSameAfterReversals(int num) {
     if(num==0)
     return true;
     return !(num%10==0);
      
   }
}