// Last updated: 7/31/2026, 9:03:37 AM
class Solution {

    public int compress(char[] chars) {

        int write = 0;
        int count = 1;

        for (int i = 0; i < chars.length; i++) {

            if (i + 1 < chars.length && chars[i] == chars[i + 1]) {

                count++;

            } else {

                chars[write] = chars[i];
                write++;

                if (count > 1) {

                    String number = String.valueOf(count);

                    for (int j = 0; j < number.length(); j++) {

                        chars[write] = number.charAt(j);
                        write++;
                    }
                }

                count = 1;
            }
        }

        return write;
    }
}