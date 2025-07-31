package Arrays;

import javax.swing.*;

public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        if (s.length() == 1) {
            return 1;
        }

        char[] chars = s.toCharArray();
        int maxLength = 0;
        int start = 0;
        int[] charIndex = new int[256];

        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];
            if (charIndex[currentChar] > start) {
                start = charIndex[currentChar];
            }
            charIndex[currentChar] = i + 1;
            maxLength = Math.max(maxLength, i - start + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabbabbcc";
        int result = lengthOfLongestSubstring(s);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }
}
