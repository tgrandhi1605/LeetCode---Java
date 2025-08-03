package BackTracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CombinationsPhoneNumber {
    public static List<String> letterCombinationsOfPhoneNumber(String digits) {
        if (digits == null || digits.isEmpty()) {
            return new ArrayList<>();
        }

        Map<Character, String> digitsToString = new HashMap<>();
        digitsToString.put('2', "abc");
        digitsToString.put('3', "def");
        digitsToString.put('4', "ghi");
        digitsToString.put('5', "jkl");
        digitsToString.put('6', "mno");
        digitsToString.put('7', "pqrs");
        digitsToString.put('8', "tuv");
        digitsToString.put('9', "wxyz");

        List<String> resultCombination = new ArrayList<>();
        backtrack(digits, digitsToString, new StringBuilder(), 0, resultCombination);
        return resultCombination;
    }

    public static void backtrack(String digits, Map<Character, String> digitsToString, StringBuilder path, int index, List<String> resultCombination) {
        if (index == digits.length()) {
            resultCombination.add(path.toString());
            return;
        }

        char digit = digits.charAt(index);
        String letters = digitsToString.get(digit);

        for (char c : letters.toCharArray()) {
            path.append(c);
            backtrack(digits, digitsToString, path, index + 1, resultCombination);
            path.deleteCharAt(path.length() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(letterCombinationsOfPhoneNumber("45"));
        System.out.println(letterCombinationsOfPhoneNumber("4"));
        System.out.println(letterCombinationsOfPhoneNumber(""));
        // System.out.println(letterCombinationsOfPhoneNumber("    "));
        // System.out.println(letterCombinationsOfPhoneNumber("1"));
    }
}
