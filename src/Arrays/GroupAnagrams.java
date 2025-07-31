package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Arrays;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] str) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : str) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] input = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>>anagrams = groupAnagrams(input);
        System.out.println(anagrams);
    }
}
