package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithDistinctCharacters {
    public static int longestSubstringWithDistinctCharacters(int k, String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLength = 0;

        for (int right=0; right<s.length(); right++) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);

            while(map.size() > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(longestSubstringWithDistinctCharacters(2, "eceba"));
        System.out.println(longestSubstringWithDistinctCharacters(1, "aa"));
        System.out.println(longestSubstringWithDistinctCharacters( 2, "aabbcc"));
    }
}
