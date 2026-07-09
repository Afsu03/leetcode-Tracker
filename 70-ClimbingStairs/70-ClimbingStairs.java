// Last updated: 7/9/2026, 9:54:22 AM
class Solution {
    public int climbStairs(int n) {
     if(n<=1){
        return 1;
     }
     int a=1;
     int b=1;

     for(int i=2;i<=n;i++){
        int c=a+b;
        b=a;
        a=c;
     }
     return a;
    }
}