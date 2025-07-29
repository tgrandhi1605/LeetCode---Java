package Basic;

public class ReverseInteger {

    public static void reverseInteger(int number) {
        int reversed = 0;
        boolean isNegative = number < 0;

        if (isNegative) {
            System.out.println("Negative number detected, can't do reversal reversal.");
        }

        number = Math.abs(number);
        while(number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed Integer: " + reversed);
    }

    public static void main(String[] args) {
        reverseInteger(12345); // Output: 54321
        reverseInteger(-67890); // Output: -9876
        reverseInteger(0); // Output: 0
        reverseInteger(100); // Output: 1
        reverseInteger(-100); // Output: -1
    }
}
