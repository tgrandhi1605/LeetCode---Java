package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacter {
    public static int firstUniqueCharacter(String s) {
        Map<Character, Integer> frequency = new HashMap<>();
        char[] characters = s.toCharArray();

        for (char c : characters) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < characters.length; i++) {
            if (frequency.get(characters[i]) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueCharacter("leetlcodebytharun"));
    }
}
