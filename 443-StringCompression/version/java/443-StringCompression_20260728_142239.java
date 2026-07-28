// Last updated: 7/28/2026, 2:22:39 PM
1class Solution {
2
3    public int compress(char[] chars) {
4
5        int write = 0;
6        int count = 1;
7
8        for (int i = 0; i < chars.length; i++) {
9
10            if (i + 1 < chars.length && chars[i] == chars[i + 1]) {
11
12                count++;
13
14            } else {
15
16                chars[write] = chars[i];
17                write++;
18
19                if (count > 1) {
20
21                    String number = String.valueOf(count);
22
23                    for (int j = 0; j < number.length(); j++) {
24
25                        chars[write] = number.charAt(j);
26                        write++;
27                    }
28                }
29
30                count = 1;
31            }
32        }
33
34        return write;
35    }
36}