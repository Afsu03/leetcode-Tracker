// Last updated: 7/9/2026, 9:53:00 AM
class Solution {
    public int dayOfYear(String date) {
        // Split the date
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        
        // Days in each month (non-leap year)
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        // Check for leap year
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            daysInMonth[1] = 29; // February = 29
        }
        
        int result = 0;
        // Add all previous months' days
        for (int i = 0; i < month - 1; i++) {
            result += daysInMonth[i];
        }
        
        // Add current day
        result += day;
        
        return result;
    }
}
