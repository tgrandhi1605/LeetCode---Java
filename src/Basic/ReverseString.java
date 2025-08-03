package Basic;

public class ReverseString {
    public static String reverseString(String s) {
        if (s == null || s.isEmpty()) return "";
        StringBuilder path = new StringBuilder();
        int count = s.length();

        for (int i = count - 1; i >= 0; i--) {
            path.append(s.charAt(i));
        }
        return path.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("tharun"));
        System.out.println(reverseString(""));
        System.out.println(reverseString("t"));
    }
}
