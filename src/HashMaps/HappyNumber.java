package HashMaps;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static boolean isHappyNumber(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = sumOfDigits(n);
        }

        return n == 1;
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isHappyNumber(1));
        System.out.println(isHappyNumber(2));
        System.out.println(isHappyNumber(3));
        System.out.println(isHappyNumber(19));
        System.out.println(isHappyNumber(152));
    }
}
