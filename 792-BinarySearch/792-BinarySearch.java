// Last updated: 9/3/2026, 2:00:08 PM
class Solution {
    public int search(int[] arr, int target) {
        int left = 0;
        int right  = arr.length-1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(arr[mid] == target){
                return mid;
            }else if(target > arr[mid]){
                 left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
       return -1;

    }
}