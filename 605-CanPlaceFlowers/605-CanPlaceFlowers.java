// Last updated: 7/31/2026, 10:05:07 AM
class Solution {
    public boolean canPlaceFlowers(int[] fb, int n) {
        for(int i=0;i<fb.length;i++){
            if(fb[i]==0 && (i==0 || fb[i-1]==0) && (i==fb.length-1 || fb[i+1]==0)){
            fb[i] = 1;
            n--;

            if(n==0){
                return true;
            }
            }
        }
        return n<=0;
    }
}