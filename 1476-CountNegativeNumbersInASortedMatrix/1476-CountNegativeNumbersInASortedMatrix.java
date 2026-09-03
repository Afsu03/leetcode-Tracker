// Last updated: 9/3/2026, 2:35:07 PM
class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i=0;i<grid.length;i++){
            int left = 0;
            int right = grid[i].length - 1;

            while(left <= right){
               int mid = left + (right - left)/2;
               if(grid[i][mid]<0){
                right = mid-1;
               }else{
                left = mid+1;
               }
            }
            count += grid[i].length - left;
        }
        return count;
    }
}