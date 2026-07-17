// Last updated: 7/17/2026, 11:15:21 AM
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3
4        s = s.replace("-", "").toUpperCase();
5
6        StringBuilder ans = new StringBuilder();
7
8        int count = 0;
9
10        for (int i = s.length() - 1; i >= 0; i--) {
11
12            ans.append(s.charAt(i));
13            count++;
14
15            if (count == k && i != 0) {
16                ans.append('-');
17                count = 0;
18            }
19        }
20
21        return ans.reverse().toString();
22    }
23}