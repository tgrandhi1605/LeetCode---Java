package SlidingWindow;

import java.util.Arrays;

public class StringPermutation {
    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(s1Count, s2Count)) return true;

        for (int j = s1.length(); j < s2.length(); j++) {
            s2Count[s2.charAt(j) - 'a']++;
            s2Count[s2.charAt(j - s1.length()) - 'a']--;

            if (Arrays.equals(s1Count, s2Count)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "bcuhretoighbccscba"));
    }
}
