// Last updated: 7/9/2026, 9:52:25 AM
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
     