package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {
    public static int characterReplacement(String s, int k) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        int left = 0;
        int maxCount = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            frequencyMap.put(rightChar, frequencyMap.getOrDefault(rightChar, 0) + 1);

            maxCount = Math.max(maxCount, frequencyMap.get(rightChar));

            while((right - left + 1) - maxCount > k) {
                char leftChar = s.charAt(left);
                frequencyMap.put(leftChar, (frequencyMap.get(leftChar) - 1));
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(characterReplacement("ABAB", 2));
    }
}
