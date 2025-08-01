package Arrays;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean isValidAnagram(String s, String t) {

        char[] char1 = s.toLowerCase().toCharArray();
        Arrays.sort(char1);

        char[] char2 = t.toLowerCase().toCharArray();
        Arrays.sort(char2);

        return Arrays.equals(char1, char2);
    }

    public static void main(String[] args) {
        System.out.println(isValidAnagram("Nagaram", "Anagram"));
        System.out.println(isValidAnagram("Ear", "Rear"));
        System.out.println(isValidAnagram("Ant", "Tan"));
    }
}
