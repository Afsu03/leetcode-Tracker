// Last updated: 9/11/2026, 2:10:21 PM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank){
     int distance = 0;
        int moves = 0;

        while (mainTank > 0) {
            moves++;
            distance += 10;
            mainTank--;

            
            if (moves % 5 == 0 && additionalTank > 0) {
                additionalTank--;
                mainTank++;
            }
        }

        return distance;
    }
}
     