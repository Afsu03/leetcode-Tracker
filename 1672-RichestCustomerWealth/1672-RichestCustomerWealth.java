// Last updated: 9/11/2026, 2:11:42 PM
class Solution {
    public int maximumWealth(int[][] acc) {
      int ans=Integer.MIN_VALUE;
      for(int i=0;i<acc.length;i++){
         int sum=0;
        for(int j=0;j<acc[i].length;j++){
           sum+=acc[i][j]; 
        }
    
      if(sum>ans){
        ans=sum;
       } 
    }
      return ans;
    }
}