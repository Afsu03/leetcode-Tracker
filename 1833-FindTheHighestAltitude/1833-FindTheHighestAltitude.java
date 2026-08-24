// Last updated: 8/24/2026, 3:45:23 PM
class Solution {
    public int largestAltitude(int[] gain) {
        int alt = 0;
        int maxalt = 0;

        for(int i=0;i<gain.length;i++){
            alt+=gain[i];

            if(alt>maxalt){
                maxalt = alt;
            }
        }
        return maxalt;
    }
}