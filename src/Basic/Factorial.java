package Basic;

public class Factorial {

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        long result = 1;

        for (int i = n; i > 1; i --) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5)); // Output: 120
        System.out.println("Factorial of 0: " + factorial(0)); // Output: 1
        System.out.println("Factorial of 1: " + factorial(1)); // Output: 1
        System.out.println("Factorial of 10: " + factorial(10)); // Output: 3628800
    }

}
