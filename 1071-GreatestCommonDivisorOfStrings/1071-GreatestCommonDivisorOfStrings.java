// Last updated: 9/11/2026, 2:13:04 PM
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