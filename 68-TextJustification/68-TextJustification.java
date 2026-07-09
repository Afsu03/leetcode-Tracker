// Last updated: 7/9/2026, 9:54:24 AM
import java.util.*;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {

        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < words.length) {

            int len = words[i].length();
            int j = i + 1;

            while (j < words.length &&
                    len + 1 + words[j].length() <= maxWidth) {

                len += 1 + words[j].length();
                j++;
            }

            StringBuilder line = new StringBuilder();

            int numWords = j - i;
            int totalChars = 0;

            for (int k = i; k < j; k++)
                totalChars += words[k].length();

            int spaces = maxWidth - totalChars;

            // Last line or single word
            if (j == words.length || numWords == 1) {

                for (int k = i; k < j; k++) {
                    line.append(words[k]);

                    if (k < j - 1)
                        line.append(" ");
                }

                while (line.length() < maxWidth)
                    line.append(" ");

            } else {

                int gaps = numWords - 1;

                int evenSpace = spaces / gaps;
                int extra = spaces % gaps;

                for (int k = i; k < j; k++) {

                    line.append(words[k]);

                    if (k < j - 1) {

                        for (int s = 0; s < evenSpace; s++)
                            line.append(" ");

                        if (extra > 0) {
                            line.append(" ");
                            extra--;
                        }
                    }
                }
            }

            result.add(line.toString());
            i = j;
        }

        return result;
    }
}