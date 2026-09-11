// Last updated: 9/11/2026, 2:11:11 PM
class Solution {
    public boolean isThree(int n) {
      if(n==1)
      return false;

      int root=(int)Math.sqrt(n);
      if(root*root!=n)
      return false;

       for (int i = 2; i * i <= root; i++) {
            if (root % i == 0) {
                return false;
            }
        }
         return true;
    }
}
