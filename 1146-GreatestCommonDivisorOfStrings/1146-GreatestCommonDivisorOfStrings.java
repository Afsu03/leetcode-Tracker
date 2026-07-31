// Last updated: 7/31/2026, 9:02:41 AM
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2+str1)){
            return "";
        }
        int gl = gcd(str1.length(), str2.length());
        return str1.substring(0,gl);

    }
    public int gcd(int a,int b){
        while(b!=0){
            int rem = a%b;
            a = b;
            b = rem;
        }
        return a;
    }
}