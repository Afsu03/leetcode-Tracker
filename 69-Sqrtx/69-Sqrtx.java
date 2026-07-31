// Last updated: 7/31/2026, 10:07:41 AM
class Solution {
    public int mySqrt(int x) {
    if(x==0 || x==1){
        return x;
    }
    for(int i=1;i<=x;i++){
        if((long)i*i>x){
            return i - 1;
        }
        if((long)i*i==x){
            return i;
        }
    }
     return x;
    }
}