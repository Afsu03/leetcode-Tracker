// Last updated: 7/9/2026, 9:54:13 AM
class Solution {
    public int maxProfit(int[] price) {
      int min = price[0];
      int profit=0;

      for (int i=1;i<price.length;i++){
        if(price[i]<min){
            min=price[i];
        }
        int curr=price[i]-min;
      
      if(curr>profit){
        profit=curr;
      }
    }
    return profit;
}
}
