// Last updated: 7/9/2026, 9:53:58 AM
class Solution {
    public String convertToTitle(int coloumnNumber) {
      StringBuilder result=new StringBuilder();
      while(coloumnNumber>0){
          coloumnNumber--;
          int remainder=coloumnNumber%26;
          char ch=(char)('A'+remainder);
          result.append(ch);
          coloumnNumber/=26;
        }
       return result.reverse().toString();
    }
}