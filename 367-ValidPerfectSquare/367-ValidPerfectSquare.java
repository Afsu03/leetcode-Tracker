// Last updated: 9/3/2026, 2:57:08 PM
class Solution {
    public boolean isPerfectSquare(int num) {
       long left = 1;
       long right = num;

       while(left <= right){
        long mid = left + (right - left)/2;
        long sqr = mid*mid;

        if(num==sqr){
            return true;
        }else if(num>sqr){
            left = mid+1;
        }else{
            right = mid-1;
        }
       }
       return false;
    }
}