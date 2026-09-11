// Last updated: 9/11/2026, 2:12:20 PM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candy, int extra) {
        int max = candy[0];
        for(int i=1;i<candy.length;i++){
            if(candy[i]>max){
                max = candy[i];
            }
        }
        List<Boolean>list = new ArrayList<>();
        for(int i=0;i<candy.length;i++){
         if(candy[i]+extra>=max){
            list.add(true);
         }else{
            list.add(false);
         }
        }
        return list;
    }
}