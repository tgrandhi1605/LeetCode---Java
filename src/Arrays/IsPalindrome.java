package Arrays;

public class IsPalindrome {
    public static boolean isPalindrome(String string) {
        string = string.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        System.out.println("Formatted text: " + string);

        char[] plainText = string.toCharArray();

        for (int i = 0; i < plainText.length / 2; i++) {
                if (plainText[i] != plainText[plainText.length - 1 - i]) {
                    return false;
                }
        }
        return true;

    }

    public static void main(String[] args) {
        String text1 = "A man, a plan, a canal: Panama";
        String text2 = "race a car";
        String text3 = "     ";


        System.out.println(isPalindrome(text1));
        System.out.println(isPalindrome(text2));
        System.out.println(isPalindrome(text3));
    }
}
