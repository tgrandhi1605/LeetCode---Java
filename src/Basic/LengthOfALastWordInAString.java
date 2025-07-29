package Basic;

public class LengthOfALastWordInAString {

    public  static int lengthOfALastWordInAString(String a) {

        if (a == null || a.isEmpty()) {
            return 0;
        }

        String[] words = a.trim().split("\\s+");

        if (words.length == 0) {
            return 0;
        }

        String lastWord = words[words.length - 1];

        return lastWord.length();
    }

    public static void main(String[] args) {
        System.out.println("Length of last word: " + lengthOfALastWordInAString("Hello World")); // Output: 5
        System.out.println("Length of last word: " + lengthOfALastWordInAString("   Leading spaces")); // Output: 6
        System.out.println("Length of last word: " + lengthOfALastWordInAString("Trailing spaces   ")); // Output: 7
        System.out.println("Length of last word: " + lengthOfALastWordInAString("   ")); // Output: 0
        System.out.println("Length of last word: " + lengthOfALastWordInAString("javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=55978:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding")); // Output: 0
    }
}
